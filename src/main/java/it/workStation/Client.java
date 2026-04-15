package it.workStation;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import it.workStation.CalculatorOuterClass.AddRequest;
import it.workStation.CalculatorOuterClass.AddResponse;

import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        CalculatorGrpc.CalculatorBlockingStub stub =
                CalculatorGrpc.newBlockingStub(channel);

        AddRequest request = AddRequest.newBuilder()
                .setA(5)
                .setB(3)
                .build();

        AddResponse response = stub.add(request);
        System.out.println("Result: " + response.getResult());

        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
}