package com.Cursor.java;

public class Car {

    public static void main(String[] args) {
        Machine car = new Machine();
        car.setName();
        car.startUp();
        car.setSpeed(50);
        car.setGO(90);
        car.stopped();
    }
}


class Machine {
    private static String name;
    private static boolean startUp;
    private static boolean stopped;
    private static int ride;
    private static int speed;


    public Machine() {
        this.ride = ride;
        this.speed = speed;


    }


    public void setName() {
        this.name = name;

        System.out.println("Trademark of car is - Porsche ");
    }

    public String getName() {
        return name;
    }


    public void startUp() {
        startUp = true;
        System.out.println("The car is started");
    }

    public void stopped() {
        stopped = false;
        System.out.println("The car is stopped, because engine is off.");
    }


    public void setGO(int go) {
        this.ride = ride;
        System.out.println("The car is keeping the speed: " + go + " km per hour");

    }

    public int getGo() {
        return ride;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) {
            this.speed = speed;
            System.out.println("The car is staying, because speed is " + speed);
        } else {
            System.out.println("The car is riding, because it has speed  " + speed + " km per hour");
        }
    }

    public int getSpeed() {
        return speed;
    }


}



