package com.bl.methodoverriding;

public class Box extends Shape {
    public void draw() {
        System.out.println("BOX ");
    }

    public void numberOfSides() {
        System.out.println("side= 6");
    }
}
