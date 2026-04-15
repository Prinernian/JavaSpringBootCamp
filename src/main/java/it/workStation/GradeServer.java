package it.workStation;

import io.grpc.ServerBuilder;
import java.io.IOException;

public class GradeServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        io.grpc.Server server = ServerBuilder.forPort(9090)
                .addService(new GradeServiceImpl())
                .build()
                .start();

        System.out.println("Grade Server running on port 9090...");
        server.awaitTermination();
    }
}
