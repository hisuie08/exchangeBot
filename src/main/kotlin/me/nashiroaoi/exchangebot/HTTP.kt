package me.nashiroaoi.exchangebot

import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import okhttp3.Request

const val url:String = "https://api.coinbase.com/v2/exchange-rates?currency="

@Serializable
data class ExchangeModel (
    val data: Data? = null
)

@Serializable
data class Data (
    val currency: String? = null,
    val rates: Map<String, String>? = null
)


fun get(currency : String) : ExchangeModel? {
    val request = Request.Builder().url(url+currency).build()
    val response = OkHttpClient().let { it.newCall(request) }.execute()
    return if(response.isSuccessful) {
        Json.decodeFromString(ExchangeModel.serializer(), response.body!!.string())
    } else {
        null
    }
}