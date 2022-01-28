class Setting(private var endpoint: String, private var token: String) {

    fun getEndpoint(): String {
        return endpoint;
    }

    fun getToken(): String {
        return token;
    }

}