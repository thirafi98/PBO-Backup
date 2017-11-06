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
public class Circle implements GeometricObject{
    protected double radius = 1.0;
    
    public void Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2*PI*this.radius;
    }

    @Override
    public double getArea() {
        return PI*this.radius*this.radius;
    }
    
}
