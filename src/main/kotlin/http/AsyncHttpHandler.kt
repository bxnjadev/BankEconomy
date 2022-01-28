package http

import com.google.api.client.http.GenericUrl
import com.google.api.client.http.HttpRequest
import com.google.api.client.http.HttpRequestFactory
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.http.json.JsonHttpContent
import com.google.api.client.json.JsonFactory
import com.google.api.client.json.JsonObjectParser
import com.google.api.client.json.jackson2.JacksonFactory

class AsyncHttpHandler<T>(
    private var endpoint: String,
    private var clazz: Class<T>
    ) : HttpHandler<T> {

    private val requestFactory: HttpRequestFactory;
    private val url: GenericUrl;
    private val jsonFactory : JsonFactory;

    init {
        jsonFactory = JacksonFactory();

        requestFactory = NetHttpTransport()
            .createRequestFactory { request: HttpRequest ->
                request.parser = JsonObjectParser(jsonFactory);
            }

        url = GenericUrl(endpoint);
    }

    override fun getEndpoint(): String {
        return endpoint;
    }

    override fun post(type: T, endpoint: String) {
        val genericUrl = createGenericUrl(endpoint);

        requestFactory
            .buildPostRequest(
                genericUrl,
                    JsonHttpContent(jsonFactory,
                            type
                        )
            ).execute();
    }

    override fun put(type: T, endpoint: String) {
        val genericUrl = createGenericUrl(endpoint);

        requestFactory
            .buildPutRequest(
                genericUrl,
                JsonHttpContent(jsonFactory,
                    type
                )
            ).execute();
    }

    override fun get(id: String, endpoint: String): T {
        val genericUrl = createGenericUrl(endpoint);
        val response = requestFactory.buildGetRequest(
            genericUrl
        ).execute();

        return response.parseAs(clazz);
    }

    override fun delete(id: String, endpoint: String): Boolean {
        val genericUrl = createGenericUrl(endpoint);
        requestFactory.buildDeleteRequest(genericUrl).execute();

        return true;
    }

    private fun createGenericUrl(endpoint: String): GenericUrl {
        var url = this.url;

        if (endpoint.isNotEmpty()) {
            url = GenericUrl(this.endpoint + endpoint);
        }

        return url;
    }

}