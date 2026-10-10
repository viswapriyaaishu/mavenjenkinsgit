package com.college;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void testStudentId() {
        Student student = new Student(1, "sita");
        assertEquals(1, student.getId());
    }

    @Test
    void testStudentName() {
        Student student = new Student(1, "sita");
        assertEquals("sita", student.getName());
    }

    @Test
    void testDisplayName() {
        Student student = new Student(1, "sita");
        assertEquals("Sita", student.getDisplayName());
    }

    @Test
    void testAlreadyCapitalizedName() {
        Student student = new Student(2, "Ram");
        assertEquals("Ram", student.getDisplayName());
    }

    @Test
    void testWrongExpectedName() {
        Student student = new Student(3, "sita");
        assertEquals("SITA", student.getDisplayName());
    }

    @Test
    void testWrongExpectedId() {
        Student student = new Student(4, "Ravi");
        assertEquals(100, student.getId());
    }
}