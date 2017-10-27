/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.if4003.contoh.test;

/**
 *
 * @author Thirafi Wian
 */
public class student {
    private String name;
    private long studentId;
    private boolean isMale;
    private double grade;
    
  
    
   public student(String name, long studentId, boolean isMale, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.isMale = isMale;
        this.grade = grade;
    }
   public student(String name, long studentId, boolean isMale) {
        this.name = name;
        this.studentId = studentId;
        this.isMale = isMale;
        
    }
   public student(String name, long studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
       
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!"".equals(name)){
            this.name = name;
        }else{
            System.out.println("error");
        }
    }

    
    public long getStudentId() {
        return studentId;
    }

    
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    
    public boolean isIsMale() {
        return isMale;
    }

    
    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public double getGrade() {
        return grade;
    }

   
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
        public void display() {
        if("".equals(name)){
            System.out.println("kosong woi");
        }else{
            System.out.println("Name: "+name);
        }
        if(studentId>0 && studentId<10){
            System.out.println("StudentID: "+studentId);
        }else{
            System.out.println("errir");
        }
        
        if(isMale) {
            System.out.println("Sex: Male");
        } else {
            System.out.println("Sex: Female");
        }
        if(grade>0 && grade<4){
            System.out.println("Grade: "+grade);
        }else{
            System.out.println("Unexpected Grade");
        }
        
    }

    
    
    
}
