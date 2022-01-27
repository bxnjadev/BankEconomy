package http

interface HttpHandler<T> {

    fun post(type : T, endpoint : String = "");

    fun put(type : T, endpoint : String = "");

    fun get(id : String, endpoint : String = "") : T;

    fun delete(id : String, endpoint: String) : Boolean;

    fun getEndpoint() : String;

}