/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exass1;

/**
 *
 * @author Thirafi Wian
 */
public class Plane implements Flyable, Vehicle {
    private int velocity;

    @Override
    public void fly() {
        System.out.println("Plane flying using jet machine");
    }

    @Override
    public void move() {
        System.out.println("velocity = " + velocity);
    }

    @Override
    public void brake() {
        if (velocity>0) velocity--;
        System.out.println("velocity="+velocity);
    }

}

