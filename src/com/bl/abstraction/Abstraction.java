package com.bl.abstraction;

public class Abstraction {
    public static void main(String args[]) {
        Car obj = new Tesla();
        obj.drive();
        obj.gearChange();
    }
}
