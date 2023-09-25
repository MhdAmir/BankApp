/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapp.entity;

/**
 *
 * @author mamir
 */

public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private String namaUser;
    private String password;
    
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir, String namaUser, 
            String password)
    {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
        this.namaUser = namaUser;
        this.password = password;
    }
    
    public Nasabah(String namaAwal, String namaAkhir, String namaUser, String password
            ,Tabungan tabungan){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
        this.namaUser = namaUser;
        this.password = password;
        this.tabungan = tabungan;
    }
    
    
    public String getNamaAwal(){
        return namaAwal;
    }
    
    public String getNamaAkhir(){
        return namaAkhir;
    }
    public String getNamaUser(){
        return namaUser;
    }
    public String getPassword(){
        return password;
    }
    public Tabungan getTabungan(){
        return tabungan;
    }
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
}
