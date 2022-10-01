package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestClassroom {

    Classroom classroom;
    
    @BeforeEach
    void setUp() {classroom = new Classroom(); }

    @Test
    @DisplayName("Addition")
    void testAdd() {
        assertEquals(10, classroom.add(8, 4));
    }

    @Test
    @DisplayName("Subtraction")
    void testSubtract() {
        assertEquals(5, classroom.subtract(10, 5));
    }

    @Test
    @DisplayName("Multiplication")
    void testMultiply() {
        assertEquals(21, classroom.multiply(7, 3));
    }

    @Test
    @DisplayName("Division")
    void testDivide() {
        assertEquals(6, classroom.divide(42, 7));
    }

    @Test
    @DisplayName("Mode")
    void testMode() {
        assertEquals(2, classroom.mode(17, 3));
    }
}
