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
interface Message{
    String greet();
}
public class MyClass2 {
    public void displayMessage(Message m){
        System.out.println(m.greet() + ", Example of anonymous inner class as an argument");
    }
    public static void main(String[] args) {
        MyClass2 obj = new MyClass2();
        obj.displayMessage(new Message() {
            @Override
            public String greet() {
                return "Hello";
            }
        });
    }
}
