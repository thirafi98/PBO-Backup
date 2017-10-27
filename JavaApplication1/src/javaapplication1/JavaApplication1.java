/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;


/**
 *
 * @author Thirafi Wian
 */
public class JavaApplication1 {

    public static void main (String [] args)
    {
       Scanner s = new Scanner(System.in);
       int p,h = 1;
       
        System.out.print("Masukkan pangkat: ");
        p=s.nextInt();
        
        for(int i=1;i<=p;i++){
            h=h*2;
        }
        System.out.println("2 pangkat "+p+" adalah "+h);
        
    }
  }

    

