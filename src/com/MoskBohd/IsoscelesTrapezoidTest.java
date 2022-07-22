package com.MoskBohd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsoscelesTrapezoidTest {

    IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(2, 3, 5);
    private double testArea;
    private double testPerimeter;
    private double testLengthOfSide;
    private double testLengthOfEachDiagonal;
    private double testAcuteAngle;

    @BeforeEach
    public void setUp() {
        testArea = (isoscelesTrapezoid.getLenghtDown() + isoscelesTrapezoid.getLenghtUp()) * isoscelesTrapezoid.getHeight()/2;
        testPerimeter = (isoscelesTrapezoid.getLenghtDown() + isoscelesTrapezoid.getLenghtUp() + 2 * isoscelesTrapezoid.getHeight());
        testLengthOfSide = Math.sqrt(Math.pow((isoscelesTrapezoid.getLenghtDown() - isoscelesTrapezoid.getLenghtUp())/2, 2) + Math.pow(isoscelesTrapezoid.getHeight(), 2));
        testLengthOfEachDiagonal = Math.sqrt(isoscelesTrapezoid.getLenghtDown() * isoscelesTrapezoid.getLenghtUp() + Math.pow(isoscelesTrapezoid.getLengthOfSide(), 2));
        testAcuteAngle = Math.acos(((2 * isoscelesTrapezoid.getLengthOfSide()) / (isoscelesTrapezoid.getLenghtUp() * isoscelesTrapezoid.getLenghtDown())));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getArea() {
        System.out.println("@Test Area(): " + isoscelesTrapezoid.getArea() + " = " + testArea);
        assertEquals(testArea, isoscelesTrapezoid.getArea());
    }

    @Test
    void getPerimeter() {
        System.out.println("@Test Perimeter(): " + isoscelesTrapezoid.getPerimeter() + " = " + testPerimeter);
        assertEquals(testPerimeter, isoscelesTrapezoid.getPerimeter());
    }

    @Test
    void getLengthOfSide() {
        System.out.println("@Test LengthOfSide(): " + isoscelesTrapezoid.getLengthOfSide() + " = " + testLengthOfSide);
        assertEquals(testLengthOfSide, isoscelesTrapezoid.getLengthOfSide());
    }

    @Test
    void getLengthOfEachDiagonal() {
        System.out.println("@Test LengthOfEachDiagonal(): " + isoscelesTrapezoid.getLengthOfEachDiagonal() + " = " + testLengthOfEachDiagonal);
        assertEquals(testLengthOfEachDiagonal, isoscelesTrapezoid.getLengthOfEachDiagonal());
    }

    @Test
    void getAcuteAngle() {
        System.out.println("@Test AcuteAngle(): " + isoscelesTrapezoid.getAcuteAngle() + " = " + testAcuteAngle);
        assertEquals(testAcuteAngle, isoscelesTrapezoid.getAcuteAngle());
    }
}