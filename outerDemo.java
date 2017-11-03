/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capek;

/**
 *
 * @author Praktikum
 */
public class outerDemo {
    private int num = 200;
    
    class innerDemo{
        public void print(){
            System.out.println("This is an inner class");
        }
        public int getNum(){
            return num;
        }
    }
}
