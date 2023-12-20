package com.xiaoran.network

interface HttpApi {

    fun get(params: Map<String, Any>, path: String, callback: Any) {}

    fun post() {}
}