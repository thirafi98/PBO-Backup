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
public class lecture {

    private String name;
    private String credit;
    private lecturer lect = new lecturer();
    private student[] std;
    private int maxstudent = 0;
    private int numStudent = 0;
    
    public lecture(String name, String credit, int maxstudent) {
        this.name = name;
        this.credit = credit;
        std = new student[maxstudent];
        this.maxstudent = maxstudent;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLecturer(String name, String code) {
        lecturer(name,code);
//        this.lect.code = code;
//        this.lect.name = name;
    }

    public lecturer getLecturer() {
        return lect;
    }

    public void addStudent(student s) {
        std[numStudent] = s;
        numStudent++;
    }

    public int getNumStudent() {
        return numStudent;
    }

    public student getStudent(int n) {
        return std[n];
    }

    public void displayMatkul(){
        System.out.println("Name : "+name);
        System.out.println("Credit : "+credit);
    }
   

    private void lecturer(String name, String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
