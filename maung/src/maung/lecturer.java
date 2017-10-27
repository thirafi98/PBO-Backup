/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maung;

/**
 *
 * @author Thirafi Wian
 */
public class lecturer {
    String code, name;
    

    public lecturer(String name, String code) {
        this.name = name;
        this.code = code;
    }
    
    public lecturer(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public void displayLect(){
        System.out.println("Display Lecturer : ");
        System.out.println("Name : "+name);
        System.out.println("Code : "+code);
    }
    
}
