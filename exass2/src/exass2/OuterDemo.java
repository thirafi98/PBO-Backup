package exass2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab IF
 */
public class OuterDemo {
   private int num =200;
    
    class InnerDemo{
        public void print(){
            System.out.println("This is an Inner Class");
        }
        public int getNum(){
            return num;
        }
    }
}
