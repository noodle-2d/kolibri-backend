package com.ran.kolibri.api

import com.ran.kolibri.api.service.ApiService
import com.ran.kolibri.service.idp.IdpServiceGrpc
import io.grpc.ManagedChannelBuilder
import io.grpc.ServerBuilder

fun main() {
    val idpPort = 50051
    val idpHost = "localhost"
    val idpChannel = ManagedChannelBuilder.forAddress(idpHost, idpPort).build()
    val idpStub = IdpServiceGrpc.newBlockingStub(idpChannel)

    val apiPort = 50050
    val apiService = ApiService(idpStub)
    val apiServer = ServerBuilder
            .forPort(apiPort)
            .addService(apiService)
            .build()
            .start()
    println("Api server started")

    Runtime.getRuntime().addShutdownHook(Thread {
        apiServer.shutdown()
        println("Api server stopped")
    })

    apiServer.awaitTermination()
}
