package it.workStation;

import io.grpc.stub.StreamObserver;
import it.workStation.CalculatorOuterClass.AddRequest;
import it.workStation.CalculatorOuterClass.AddResponse;

public class CalculatorServiceImpl extends CalculatorGrpc.CalculatorImplBase {

    @Override
    public void add(AddRequest request, StreamObserver<AddResponse> responseObserver) {
        int result = request.getA() + request.getB();

        AddResponse response = AddResponse.newBuilder()
                .setResult(result)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}