package it.workStation;

import io.grpc.ServerBuilder;
import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        io.grpc.Server server = ServerBuilder.forPort(8080)
                .addService(new CalculatorServiceImpl())
                .build()
                .start();

        System.out.println("Server running on port 8080");
        server.awaitTermination();
    }
}