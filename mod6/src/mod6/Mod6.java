/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod6;

/**
 *
 * @author Thirafi Wian
 */
public class Mod6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        square s = new square((double)4.2);
        circle c = new circle((double)6.2);
        s.showShape();
        System.out.println("Hasil square : "+s.hitungLuas());
        c.showShape();
        System.out.println("Hasil circle : "+c.hitungLuas());
        
        
        
        
    }

    
}
