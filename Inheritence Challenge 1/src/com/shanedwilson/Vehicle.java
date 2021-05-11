package com.shanedwilson;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirecton;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirecton = 0;
    }

    public void steer(int direction) {
        this.currentDirecton += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirecton + " degrees.");
    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirecton = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirecton);
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirecton() {
        return currentDirecton;
    }

    public void setCurrentDirecton(int currentDirecton) {
        this.currentDirecton = currentDirecton;
    }
}
