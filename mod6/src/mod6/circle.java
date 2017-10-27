/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod6;

/**
 *
 * @author Thirafi Wian
 */
public class circle implements shapes{
    private double jari;

    public circle(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    @Override
    public double hitungLuas(){
        return pi * jari * jari;
    }
    
    @Override
    public void showShape(){
        System.out.println("Lingkaran");  
    }
}
