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
public class bird extends animal{
    
    public void flying(){
        System.out.println("weiiiiii");
    }
    
    @Override
    public void showName() {
        System.out.println("ini burung");
    }

    @Override
    public void movc() {
        System.out.println("terbang");
    }
    
}
