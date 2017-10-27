/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matr;

/**
 *
 * @author Thirafi Wian
 */
public class Matr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia m = new manusia();
        

        mahasiswa mhs = new mahasiswa();
        mhs.setTinggiBadan(new Double(160));
        System.out.println(mhs.getTinggiBadan().doubleValue());

        MahasiswaInternasional mhsInt = new MahasiswaInternasional();
        
    }
    
}
