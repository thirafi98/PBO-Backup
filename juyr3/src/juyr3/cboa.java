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
public class cboa {
    private String name;
    private lecturer lecturer;
    private student[] student;
    private int numOfstudent;
    private int credit;
    
    
    public cboa(String name, int credit, int maxStd){
        this.name = name;
        this.credit = credit;
        student = new student[maxStd];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
        
    public void setLecturer(String name, String code){
        lecturer = new lecturer(name, code);
    }
    
    public lecturer getLecturer(){
        return lecturer;
    }
    
    public void addStudent(student s){
        if(numOfstudent < student.length){
            student[numOfstudent]= s;
            numOfstudent++;
        }else{
            System.out.println("kuota penuh");
        }
    }
    
    public student getStudent(int n){
        return student[n];
    }
    
    public int getNumOffStudent(){
        return numOfstudent;
    }
}
