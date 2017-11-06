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
public class Bird extends Animal implements Flyable{

    @Override
    public void breath() {
        System.out.println("Burung bernafas menggunakan paru-paru");
    }

    @Override
    public void eat() {
        System.out.println("Burung memakan makanan");
    }

    @Override
    public void fly() {
        System.out.println("Burung terbang menggunakan sayap");
    }

}
