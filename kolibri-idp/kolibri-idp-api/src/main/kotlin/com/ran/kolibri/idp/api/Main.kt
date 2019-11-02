package com.ran.kolibri.idp.api

import com.ran.kolibri.idp.api.service.IdpService
import io.grpc.ServerBuilder

fun main() {
    val idpPort = 50051
    val idpService = IdpService()
    val idpServer = ServerBuilder
            .forPort(idpPort)
            .addService(idpService)
            .build()
            .start()
    println("Idp api server started")

    Runtime.getRuntime().addShutdownHook(Thread {
        idpServer.shutdown()
        println("Idp api server stopped")
    })

    idpServer.awaitTermination()
}
