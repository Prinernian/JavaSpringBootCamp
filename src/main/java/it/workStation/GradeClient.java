package it.workStation;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import it.workStation.GradesOuterClass.StudentRequest;
import it.workStation.GradesOuterClass.GradeResponse;

import java.util.concurrent.TimeUnit;

public class GradeClient {
    public static void main(String[] args) throws InterruptedException {

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        GradeServiceGrpc.GradeServiceBlockingStub stub =
                GradeServiceGrpc.newBlockingStub(channel);

        // Ask for multiple students
        String[] students = {"Alice", "Bob", "Carlo", "Mario"};

        for (String name : students) {
            try {
                StudentRequest request = StudentRequest.newBuilder()
                        .setStudentName(name)
                        .build();

                GradeResponse response = stub.getGrade(request);

                System.out.println("Student : " + response.getStudentName());
                System.out.println("Grade   : " + response.getGrade());
                System.out.println("Comment : " + response.getComment());
                System.out.println("----------------------------");

            } catch (StatusRuntimeException e) {
                System.out.println("RPC failed for: " + name);
            }
        }

        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
}