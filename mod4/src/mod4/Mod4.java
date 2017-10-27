/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod4;

/**
 *
 * @author Thirafi Wian
 */
public class Mod4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manajer m = new manajer("bobby",7500000,2);
        karyawan k1 = new karyawan("alex",5000000);
        karyawan k2 = new karyawan("roby", 4500000);
        karyawan k3 = new karyawan("suzy", 5250000);
        karyawan k4 = new karyawan("ben", 4750000);
        karyawan k5 = new karyawan("max", 5500000);
        m.addStaff(k1);
        m.addStaff(k2);
        m.addStaff(k3);
        m.addStaff(k4);
        m.addStaff(k5);
      
        m.setKinerja(87);
            System.out.println("Manajer : ");
            System.out.print("Nama : "+m.getNama());
            System.out.print(", Gaji : "+m.getGaji());
            System.out.println(", Golongan : "+m.getGolongan());
        
        for (int i = 0; i < m.getJmlKaryawan(); i++) {
            System.out.print("Staff ke "+i);
            System.out.print(", Nama : "+m.getStaff(i).getNama());
            System.out.println(", Gaji : "+m.getStaff(i).getGaji());
        }
        
        
    }
    
}
