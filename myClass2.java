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
interface message{
    String greet();
}

public class myClass2 {
    public void displayPesan(message m){
        System.out.println(m.greet()+", example of annonymous inner clas as asn argument");
        
    }
    public static void main(String[] args) {
        myClass2 obj = new myClass2();
        obj.displayPesan(new message() {
            @Override
            public String greet() {
                return "GHello";
            }
        });
    }
}
