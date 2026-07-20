package com.healthpet.services.http

import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

fun callJson() {

    val client = OkHttpClient()

    val request = Request.Builder()
        .url("https://proyect-horizon.com/api/products")
        .build()

    client.newCall(request).enqueue(object : Callback {
        override fun onFailure(call: Call, e: IOException) {
            println("Error de red: ${e.message}")
        }

        override fun onResponse(call: Call, response: Response) {
            response.use {
                if (!response.isSuccessful) {
                    println("Error en el servidor: ${response.code}")
                    return
                }

                println("Respuesta: ${response.body?.string()}")
            }
        }
    })
}