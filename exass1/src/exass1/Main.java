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
public class Main {
    public static void main(String[] args) {
        Animal a = new Bird();
        a.breath();
        a.eat();
        
        Flyable f = (Flyable) a;
        f.fly();
        
        Vehicle v = new Plane();
        v.move();
        
        f = (Flyable) v;
        f.fly();
    }
}
