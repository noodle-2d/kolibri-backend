package com.ran.kolibri.api.service

import com.ran.kolibri.model.idp.SignInRequest
import com.ran.kolibri.model.idp.SignInResponse
import com.ran.kolibri.model.idp.SignUpRequest
import com.ran.kolibri.model.idp.SignUpResponse
import com.ran.kolibri.service.api.ApiServiceGrpc.ApiServiceImplBase
import com.ran.kolibri.service.idp.IdpServiceGrpc.IdpServiceBlockingStub
import io.grpc.stub.StreamObserver

class ApiService(private val idpStub: IdpServiceBlockingStub) : ApiServiceImplBase() {

    override fun signUp(request: SignUpRequest, responseObserver: StreamObserver<SignUpResponse>) {
        val response = idpStub.signUp(request)
        responseObserver.onNext(response)
        responseObserver.onCompleted()
    }

    override fun signIn(request: SignInRequest, responseObserver: StreamObserver<SignInResponse>) {
        val response = idpStub.signIn(request)
        responseObserver.onNext(response)
        responseObserver.onCompleted()
    }
}
