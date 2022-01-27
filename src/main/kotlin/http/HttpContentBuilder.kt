package http

import com.google.api.client.http.HttpContent
import com.google.api.client.http.UrlEncodedContent
import com.google.api.client.http.json.JsonHttpContent
import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashMap

class HttpContentBuilder() {

    private val content: MutableMap<String, Any> = mutableMapOf();

    fun put(string: String, type: Any): HttpContentBuilder {
        content[string] = type;
        return this;
    }

    fun build(): HttpContent {
        return UrlEncodedContent(content);
    }

}