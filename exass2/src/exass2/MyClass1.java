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
public class MyClass1 {
    public static void main(String[] args) {
        OuterDemo.InnerDemo inner = new OuterDemo().new InnerDemo();
        inner.print();
        System.out.println("Num = " + inner.getNum());
    }
}
