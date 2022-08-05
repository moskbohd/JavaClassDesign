package com.MoskBohd.Test;

import com.MoskBohd.IsoscelesTrapezoid;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsoscelesTrapezoidTest {

    public IsoscelesTrapezoid isoscelesTrapezoidTest;

    @BeforeEach
    public void setUp() {
        isoscelesTrapezoidTest = new IsoscelesTrapezoid(2, 3, 5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getArea() {
        assertEquals(12.5, isoscelesTrapezoidTest.getArea(),0.01);
    }

    @Test
    void getPerimeter() {
        assertEquals(15, isoscelesTrapezoidTest.getPerimeter(), 0.01);
    }

    @Test
    void getLengthOfSide() {
        assertEquals(5, isoscelesTrapezoidTest.getLengthOfSide(), 0.01);
    }

    @Test
    void getLengthOfEachDiagonal() {
        assertEquals(5.5, isoscelesTrapezoidTest.getLengthOfEachDiagonal(), 0.01);
    }

    @Test
    void getAcuteAngle() {
        assertEquals(0.6, isoscelesTrapezoidTest.getAcuteAngle(), 0.01);
    }
}