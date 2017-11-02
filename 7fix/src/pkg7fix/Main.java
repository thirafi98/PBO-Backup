/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7fix;

import java.util.ArrayList;

/**
 *
 * @author Thirafi Wian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <animal> ar = new ArrayList();
        animal a1 = new animal(){
            @Override
            public void showName() {
                System.out.println("Bird");
            }

            @Override
            public void move() {
                System.out.println("Flying");
            }
            
        };
        animal a2 = new animal(){
            @Override
            public void showName() {
                System.out.println("Cat");
            }

            @Override
            public void move() {
                System.out.println("Walking");
            }
            
        };
        animal a3 = new animal(){
            @Override
            public void showName() {
                System.out.println("Fish");
            }

            @Override
            public void move() {
                System.out.println("Swimming");
            }
            
        };
        
        ar.add(a1);
        ar.add(a2);
        ar.add(a3);
        for (animal s:ar){
            s.showName();
            s.move();
        }
    }
    
}
