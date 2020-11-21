package com.Cursor.java;

public class Circle {
    public static void main(String[] args) {
        Circle1 circle = new Circle1();
        System.out.println("The square of circle = " );
        circle.Circle1(3);
    }
}

class Circle1 {
    private double radius ;

    public void Circle1(double radius) {
        this.radius = radius;
        System.out.println(squareOfCircle());
    }

    public double squareOfCircle() {

        return (Math.PI * radius * radius);

    }


}
