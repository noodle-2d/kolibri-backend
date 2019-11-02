package com.ran.kolibri.idp.api.service

import com.ran.kolibri.model.idp.SignInRequest
import com.ran.kolibri.model.idp.SignInResponse
import com.ran.kolibri.model.idp.SignUpRequest
import com.ran.kolibri.model.idp.SignUpResponse
import com.ran.kolibri.service.idp.IdpServiceGrpc.IdpServiceImplBase
import io.grpc.stub.StreamObserver

class IdpService : IdpServiceImplBase() {

    override fun signUp(request: SignUpRequest, responseObserver: StreamObserver<SignUpResponse>) {
        val response = SignUpResponse.newBuilder().apply {
            accessToken = request.username + request.password
            refreshToken = request.password + request.username
        }.build()

        responseObserver.onNext(response)
        responseObserver.onCompleted()
    }

    override fun signIn(request: SignInRequest, responseObserver: StreamObserver<SignInResponse>) {
        val response = SignInResponse.newBuilder().apply {
            accessToken = request.password + request.username
            refreshToken = request.username + request.password
        }.build()

        responseObserver.onNext(response)
        responseObserver.onCompleted()
    }
}
