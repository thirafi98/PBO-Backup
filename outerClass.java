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
public class outerClass {
    void myMethod(){
        int num = 23;
        class methodInnerDemo{
            public void print(){
                System.out.println("This is method inner class "+num);
                
            }
        }
        methodInnerDemo inner = new methodInnerDemo();
        inner.print();
    }
    public static void main(String[] args) {
        outerClass outer = new outerClass();
        outer.myMethod();
    }
}
