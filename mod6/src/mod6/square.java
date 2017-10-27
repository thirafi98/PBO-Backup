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
public class square implements shapes{
    private double sisi;

    public square(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double hitungLuas(){
        return sisi * sisi;
    }
    
    @Override
    public void showShape(){
        System.out.println("Persegi"); 
    }
    
    
    
}
