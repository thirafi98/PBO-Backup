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
public class cat extends animal{

    public void walking(){
        System.out.println("jalan");
    }
    
    @Override
    public void showName() {
        System.out.println("ini kucing");
    }

    @Override
    public void movc() {
        System.out.println("walking");
    }
    
}
