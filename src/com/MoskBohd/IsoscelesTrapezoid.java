package com.MoskBohd;

import java.util.Objects;

public class IsoscelesTrapezoid {
    double lengthUp = 0;
    double lengthDown = 0;
    double height = 0;

    // Constructor
    public IsoscelesTrapezoid(int lengthUp, int lengthDown, int height) {
        this.lengthUp = lengthUp;
        this.lengthDown = lengthDown;
        this.height = height;
    }

    // Getters/Setters
    public double getLengthUp() {
        return lengthUp;
    }

    public void setLengthUp(double lengthUp) {
        this.lengthUp = lengthUp;
    }

    public double getLengthDown() {
        return lengthDown;
    }

    public void setLengthDown(double lengthDown) {
        this.lengthDown = lengthDown;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 5 methods
    public double getArea(){
        return (this.getLengthDown() + this.getLengthUp()) * this.getHeight()/2;
    }
    public double getPerimeter(){
        return (this.getLengthDown() + this.getLengthUp() + 2 * this.getHeight());
    }
    public double getLengthOfSide(){
        return Math.sqrt(Math.pow((this.getLengthDown() - this.getLengthUp())/2, 2) + Math.pow(this.getHeight(), 2));
    }
    public double getLengthOfEachDiagonal(){
        return Math.sqrt(this.getLengthDown() * this.getLengthUp() + Math.pow(this.getLengthOfSide(), 2));
    }
    public double getAcuteAngle(){
        return Math.acos(((2 * this.getLengthOfSide()) / (this.getLengthUp() * this.getLengthDown())));
    }

    // Override toString() method
    @Override
    public String toString() {
        return "IsoscelesTrapezoid{" +
                "lengthUp=" + lengthUp +
                ", lengthDown=" + lengthDown +
                ", height=" + height +
                '}';
    }

    // Override hash() and equals() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsoscelesTrapezoid that = (IsoscelesTrapezoid) o;
        return Double.compare(that.getLengthUp(), getLengthUp()) == 0 && Double.compare(that.getLengthDown(), getLengthDown()) == 0 && Double.compare(that.getHeight(), getHeight()) == 0 && Double.compare(that.getArea(), getArea()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLengthUp(), getLengthDown(), getHeight(), getArea());
    }
}
