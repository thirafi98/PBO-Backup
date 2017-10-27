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
public class lecture {
    private String name;
    private lecturer lecturer;
    private student[]  student;
    private int numOfStudent = 0;
    private int credit;
    
    public lecture(String name, int credit, int maxStudent) {
        this.name = name;
        this.credit = credit;
        student = new student[maxStudent];
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
        if (numOfStudent < student.length) {
            this.student[numOfStudent] = s;
            this.numOfStudent++;            
        }
        else
            System.out.println("Kuota Penuh");
        
    }
    
    public student getStudent(int n){
        return student[n];
    }
    
    public int getNumOfStudent(){
        return numOfStudent;
    }
    
    
}
