package com.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentManagerTest {

    @Test
    public void testAddStudent() {

        StudentManager manager = new StudentManager();

        Student student =
                new Student(101, "Aswathy", "CSE");

        manager.addStudent(student);

        Student result = manager.findStudent(101);

        assertNotNull(result);
        assertEquals("Aswathy", result.getName());
        assertEquals("CSE", result.getDepartment());
    }

    @Test
    public void testSearchStudent() {

        StudentManager manager = new StudentManager();

        Student student =
                new Student(102, "Anu", "IT");

        manager.addStudent(student);

        Student result = manager.findStudent(102);

        assertNotNull(result);
        assertEquals(102, result.getId());
    }

    @Test
    public void testStudentNotFound() {

        StudentManager manager = new StudentManager();

        Student result = manager.findStudent(999);

        assertNull(result);
    }
}