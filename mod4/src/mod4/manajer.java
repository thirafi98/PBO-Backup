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
public class manajer extends karyawan{
    private karyawan[] staff = new karyawan[10];
    private int jmlKaryawan;
    private int golongan;
    private double gajiManajer;
    
    public manajer(String nama, double gaji, int golongan) {
        super(nama, gaji);
        if (golongan >= 1 && golongan <= 3) {
            this.golongan = golongan;
        } else {
            
            this.golongan = 1;
        }
    }

    public int getJmlKaryawan() {
        return jmlKaryawan;
    }

    public void setJmlKaryawan(int jmlKaryawan) {
        this.jmlKaryawan = jmlKaryawan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
    
    public void addStaff(karyawan k){
        staff[jmlKaryawan] = k;
        jmlKaryawan++;
        
    }
    
    public karyawan getStaff(int idx){
        return staff[idx];
    }

    public void setKinerja(int kinerja) {
        if(kinerja > 85){
            super.setGaji(super.getGaji()+(super.getGaji()*0.1));
            for (int i = 0; i < jmlKaryawan; i++) {
                staff[i].setGaji(staff[i].getGaji()+staff[i].getGaji()*0.1);

            }
        }else if (kinerja < 40){
            super.setGaji(super.getGaji()-(super.getGaji()*0.15));
            for (int i = 0; i < jmlKaryawan; i++) {
                staff[i].setGaji(staff[i].getGaji()-staff[i].getGaji()*0.15);
                
            }
        }     
        
    }
    
    @Override
    public double getGaji(){
        double jmlGaji = 0;
        switch (golongan) {
            case 1:
                return (super.getGaji() + 1500000);
            case 2:
                return (super.getGaji() + 2000000);
            case 3:     
                return (super.getGaji() + 3000000);
            default:
                return golongan;
        }
    }
   
}
