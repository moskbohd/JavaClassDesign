package com.MoskBohd;

public class Main {

    public static void main(String[] args) {

        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(2, 4, 3);
        System.out.println(isoscelesTrapezoid);
        System.out.println("isosceles Trapezoid are = "+ isoscelesTrapezoid.getArea() +
                " cm², perimeter = "+ isoscelesTrapezoid.getPerimeter() +
                " cm, length of side = "+ isoscelesTrapezoid.getLengthOfSide() +
                " cm, length of each diagonal = " + isoscelesTrapezoid.getLengthOfEachDiagonal() +
                " cm, acute angle = " + isoscelesTrapezoid.getAcuteAngle() + "°");


    }
}
