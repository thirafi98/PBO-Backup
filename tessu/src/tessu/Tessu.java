/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tessu;

import java.util.Scanner;

/**
 *
 * @author Thirafi Wian
 */
public class Tessu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x,y = 0, num;
       Scanner bil = new Scanner(System.in);
       int[] total;
       total = new int[100];
       
        System.out.print("N : ");
        x = bil.nextInt();
        
        for(int i=1;i<=x;i++){
            System.out.print("N ke "+i+" : ");
            total[i] = bil.nextInt();
        }
        num = total[1];
        for(int i=1;i<x;i++){
            if(total[i]<num)                
                num = total[i];
            
            y=y+total[i];
        }
        System.out.println("Hasil Min : "+num);
        System.out.println("Total : "+y);
        
    }
    
    
}
