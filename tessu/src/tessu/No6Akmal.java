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
public class No6Akmal {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int in = sc.nextInt();
            int a = 2;
            int b = 5;
            int hasil = 1;
            for(int i = 1;i <= in;i++){
                    hasil = hasil * a;
            }
            System.out.println(hasil);
    }
}
