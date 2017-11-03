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
public class Capek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outerDemo.innerDemo inner = new outerDemo().new innerDemo();
        inner.print();
        System.out.println("Num : "+inner.getNum());
    }
    
}
