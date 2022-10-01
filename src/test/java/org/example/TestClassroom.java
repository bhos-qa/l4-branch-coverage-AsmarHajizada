package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestClassroom {

    Classroom classroom;
    
    @BeforeEach
    void setUp() {classroom = new Classroom(); }

    @Test
    @DisplayName("Name should be set")
    void testSetName() {
        assertEquals("Asmar", classroom.setName("Asmar"), "It should work for any name");
    }

    @Test
    @DisplayName("Age should be set")
    void testSetAge() {
        assertEquals(15, classroom.setAge(15), "It should work for any age");
    }

    @Test
    @DisplayName("Address should be set")
    void testSetAddress() {
        assertEquals("Khatai dist. Ganja pr.", classroom.setAddress("Khatai dist. Ganja pr."), "It should work for any address");
    }

    @Test
    @DisplayName("Email should be set")
    void testSetEmail() {
        assertEquals("asmar@gmail.com", classroom.setEmail("asmar@gmail.com"), "It should work for any Email");
    }

    @Test
    @DisplayName("Classroom type should be set")
    void testSetClassroomType() {
        assertEquals(classroomType.MORNING, classroom.setClassoomType(classroomType.MORNING), "Clasroom type should be set for one of the two given types");
    }
}
