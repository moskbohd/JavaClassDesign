package com.MoskBohd;

import java.util.Objects;

public class IsoscelesTrapezoid {
    double lenghtUp = 1;
    double lenghtDown = 1.5;
    double height = 1;
    double area = height*(lenghtUp+lenghtDown)/2;

    // Constructor
    public IsoscelesTrapezoid(int lenghtUp, int lenghtDown, int height) {
        this.lenghtUp = lenghtUp;
        this.lenghtDown = lenghtDown;
        this.height = height;
    }

    // Getters/Setters
    public double getLenghtUp() {
        return lenghtUp;
    }

    public void setLenghtUp(double lenghtUp) {
        this.lenghtUp = lenghtUp;
    }

    public double getLenghtDown() {
        return lenghtDown;
    }

    public void setLenghtDown(double lenghtDown) {
        this.lenghtDown = lenghtDown;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // 5 methods


    // Override toString() method
    @Override
    public String toString() {
        return "IsoscelesTrapezoid{" +
                "lenghtUp=" + lenghtUp +
                ", lenghtDown=" + lenghtDown +
                ", height=" + height +
                ", area=" + area +
                '}';
    }

    // Override hash() and equals() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsoscelesTrapezoid that = (IsoscelesTrapezoid) o;
        return Double.compare(that.getLenghtUp(), getLenghtUp()) == 0 && Double.compare(that.getLenghtDown(), getLenghtDown()) == 0 && Double.compare(that.getHeight(), getHeight()) == 0 && Double.compare(that.getArea(), getArea()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLenghtUp(), getLenghtDown(), getHeight(), getArea());
    }
}
