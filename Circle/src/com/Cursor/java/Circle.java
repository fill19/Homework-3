package com.Cursor.java;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("The square of circle = ");
        circle.Circle(3);
    }


     static class Circle {
        private double radius;

        public void Circle(double radius) {
            this.radius = radius;
            System.out.println(squareOfCircle());
        }

        public double squareOfCircle() {

            return (Math.PI * radius * radius);

        }


    }
}
