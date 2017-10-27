/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tessuds;

import org.if4003.contoh.test.student;

/**
 *
 * @author Thirafi Wian
 */
public class Tessuds {

    
    public static void main(String[] args) {
        student s1 = new student("Max",321032,true);
        student s2 = new student("Anny",23331,true);
        student s3 = new student("Bobby",22122, 1.8);
        System.out.println("Student 1");
        s1.display();
        System.out.println("Student 2");
        s2.display();
        System.out.println("Student 3");
        s3.display();
    }

    }
    

