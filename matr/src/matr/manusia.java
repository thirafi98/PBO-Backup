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
public class manusia extends mamalia{

    private String nik;
    private String nama;
    private String alamat;
    private String tglLahir;
    private boolean sex;
    private char golDarah;
    private Double tinggiBadan;
    private Double beratBadan;
    private int statusPerkawinan;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public char getGolDarah() {
        return golDarah;
    }

    public void setGolDarah(char golDarah) {
        this.golDarah = golDarah;
    }

    public Double getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(Double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public Double getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(Double beratBadan) {
        this.beratBadan = beratBadan;
    }

    public int getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(int statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

}