package com.company.singleton.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private static Student instance;
    private final List<String> STUDENTS_LIST;

    private Student() {
        STUDENTS_LIST = new ArrayList<>();
    }

    public boolean addStudent(String studentName) {

        // If the student's name is prefixed with either senior or junior we add them to the list, as long as they have not been added already.
        if ((studentName.startsWith("senior") || studentName.startsWith("junior")) && !STUDENTS_LIST.contains(studentName)) {
            return STUDENTS_LIST.add(studentName);
        }
        return false;
    }

    public List<String> getSeniors() {
        return STUDENTS_LIST.stream()
                .filter(student -> student.startsWith("senior"))
                .collect(Collectors.toList());
    }

    public List<String> getJuniors() {
        return STUDENTS_LIST.stream()
                .filter(student -> student.startsWith("junior"))
                .collect(Collectors.toList());
    }

    public Student getInstance() {
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }
}
