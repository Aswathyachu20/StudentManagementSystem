package com.student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        System.out.println("================================");
        System.out.println("   STUDENT MANAGEMENT SYSTEM");
        System.out.println("================================");

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();

                    Student student =
                            new Student(id, name, department);

                    manager.addStudent(student);
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();

                    manager.searchStudent(searchId);
                    break;

                case 4:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}