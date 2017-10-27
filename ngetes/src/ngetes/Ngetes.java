/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngetes;
import java.util.Scanner;

/**
 *
 * @author Thirafi Wian
 */
public class Ngetes {

   
    public static void main(String[] args) {
       
        Scanner bil = new Scanner(System.in);
        int x,y = 0,min;
        int[] total;
        total = new int[100];
        
        System.out.print("Masukkan N: ");
        x=bil.nextInt();
        
        for(int i=1;i<=x;i++){
            System.out.print("bilangan ke "+i+" : ");
            total[i]=bil.nextInt();    
        }
        min=total[1]; 
        for(int i=1;i<=x;i++){
             if(total[i]<min)
                min=total[i];  
             
             y=y+total[i];
        }
        System.out.println("Terkecil : "+min);  
        System.out.println("total : "+y);    
    }
    
}
