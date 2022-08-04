package com.bl.abstraction;

public abstract class Car {
    Car() {
        System.out.println("Car is built. ");
    }

    public abstract void drive();

    public void gearChange() {
        System.out.println("Gear changed!!");
    }
}

