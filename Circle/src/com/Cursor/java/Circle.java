package com.Cursor.java;

public class Circle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The radius of circle = " + new Circle1().square());

    }
}

class Circle1 {
    private double radius;

    public Circle1() {
        radius = 3.46;
    }

    public double square() {
        return (Math.PI * radius * radius);
    }


}
