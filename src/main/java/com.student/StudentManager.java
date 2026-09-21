package com.student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.displayStudent();
        }
    }
    public Student findStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    public void searchStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                System.out.println("Student Found:");
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }
}