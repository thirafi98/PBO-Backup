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
public class ResizeableCircle extends Circle implements Resizeable{
//    public ResizeableCircle(double radius) {
//        super(radius);
//    }

    @Override
    public void resize(int percent) {
        radius *= percent;
    }
}
