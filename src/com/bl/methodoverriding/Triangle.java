package com.bl.methodoverriding;

public class Triangle extends Shape {
    public void draw() {
        System.out.println("TRIANGLE ");
    }

    public void numberOfSides() {
        System.out.println("side = 3 ");
    }
}
