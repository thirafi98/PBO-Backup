/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7d;

/**
 *
 * @author Thirafi Wian
 */
public class Mod7d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        animal a1 = new cat();
        animal a2 = new fish();
        animal a3 = new bird();
        
        a1.showName();
        a1.movc();
        a2.showName();
        a2.movc();
        a3.showName();
        a3.movc();
        
    }
    
}
