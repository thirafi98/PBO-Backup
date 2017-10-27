/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juyr3;

/**
 *
 * @author Thirafi Wian
 */
public class Juyr3 {

    public static void main(String[] args) {
        // TODO code application logic here
        student s1 = new student("Bobby", 12341);
        student s2 = new student("Suzy", 12341);
        student s3 = new student("Andrew", 12343);
        student s4 = new student("Garfield", 12344);
        student s5 = new student("Cobi", 12345);
        
        cboa l = new cboa("Calculus", 3, 3);
        l.setLecturer("Max Steel", "MXS");
        l.addStudent(s1);
        l.addStudent(s2);
        l.addStudent(s3);
        l.addStudent(s4);
        l.addStudent(s5);
        
        System.out.println("Lecture: ");
        System.out.println("Name: "+l.getName());
        System.out.println("Credit: "+l.getCredit());
        System.out.println("Num of Student: "+l.getNumOffStudent());
        
        System.out.println("Lecturer: ");
        System.out.println("Name: "+l.getLecturer().getName());
        System.out.println("Code: "+l.getLecturer().getCode());
        
        
        
        for (int i = 0; i < l.getNumOffStudent() ; i++) {
            System.out.println("Nama: "+l.getStudent(i).getName()+", id: "+l.getStudent(i).getId());
        }
    }
    
}
