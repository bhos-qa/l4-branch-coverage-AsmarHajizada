package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestDepartment {

    Department department;

    @BeforeEach
    void setUp() {department = new Department(); }

    @Test
    @DisplayName("Name should be set")
    void testSetName() {
        assertEquals("Asmar", department.setName("Asmar"), "It should work for any name");
    }

    @Test
    @DisplayName("Age should be set")
    void testSetAge() {
        assertEquals(15, department.setAge(20), "It should work for any age");
    }

    @Test
    @DisplayName("Address should be set")
    void testSetAddress() {
        assertEquals("Khatai rayonu Ganja pr.", department.setAddress("Khatai rayonu Ganja pr."), "It should work for any address");
    }

    @Test
    @DisplayName("Email should be set")
    void testSetEmail() {
        assertEquals("asmar@gmail.com", department.setEmail("asmar@gmail.com"), "It should work for any Email");
    }

    @Test
    @DisplayName("Department type should be set")
    void testSetDepartmentType() {
        assertEquals(departmentType.TECHNICAL, classroom.setDepartmentType(departmentType.TECHNICAL), "It should be set for one of the two given types");
    }
}
