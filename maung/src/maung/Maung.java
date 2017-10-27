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
public class Maung {

    public static void main(String[] args) {
        // TODO code application logic here
        lecturer lect = new lecturer("Max Steel", " MXS");
        student[] std = new student[45];
               
        lecture lec = new lecture("Calculus", "3", 45);
        lec.getLecturer();
        lec.displayMatkul();
        lect.displayLect();
        student std1 = new student("Boby", 12341);
        student std2 = new student("Suzy", 12342);
        student std3 = new student("Andrew", 12343);
        student std4 = new student("Briant", 12344);
        student std5 = new student("Cobi", 12345);
        lec.addStudent(std1);
        lec.addStudent(std2);
        lec.addStudent(std3);
        lec.addStudent(std4);
        lec.addStudent(std5);
        for (int i = 1; i <= lec.getNumStudent(); i++) {
            System.out.println("Data ke "+i+": "+lec.getStudent(i).getName()+", "+lec.getStudent(i).getId());
        }
        
      
    }
}