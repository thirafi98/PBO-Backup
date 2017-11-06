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
abstract class AnonymousInner{
    public abstract void myMethod();
}
public class OuterClass2 {
    public static void main(String[] args) {
        AnonymousInner inner = new AnonymousInner() {
            @Override
            public void myMethod() {
                System.out.println("This is an example of anonymous inner class");
            }
        };
        inner.myMethod();
    }
}
