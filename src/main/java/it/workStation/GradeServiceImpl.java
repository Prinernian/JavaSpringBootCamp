package it.workStation;

import io.grpc.stub.StreamObserver;
import it.workStation.GradesOuterClass.StudentRequest;
import it.workStation.GradesOuterClass.GradeResponse;

import java.util.HashMap;
import java.util.Map;

public class GradeServiceImpl extends GradeServiceGrpc.GradeServiceImplBase {

    // Simulating a small database of students
    private static final Map<String, Integer> grades = new HashMap<>();

    static {
        grades.put("Alice", 30);
        grades.put("Bob",   24);
        grades.put("Carlo", 27);
    }

    @Override
    public void getGrade(StudentRequest request,
                         StreamObserver<GradeResponse> responseObserver) {

        String name = request.getStudentName();
        int grade   = grades.getOrDefault(name, -1);

        String comment;
        if      (grade == -1)  comment = "Student not found!";
        else if (grade >= 28)  comment = "Excellent!";
        else if (grade >= 24)  comment = "Good!";
        else                   comment = "Keep studying!";

        GradeResponse response = GradeResponse.newBuilder()
                .setStudentName(name)
                .setGrade(grade)
                .setComment(comment)
                .build();

        System.out.println("Sending grade for " + name + ": " + grade + " (" + comment + ")");

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}