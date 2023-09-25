/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapp.entity;

import java.util.LinkedList;

/**
 *
 * @author mamir
 */
public class Bank {
    private LinkedList<Nasabah> nasabah;
    
    private String adminNamaAwal = "admin";
    private String adminNamaAkhir = "admin";
    
    public Bank() {
    }

    public void tambahNasabah(String namaAwal, String namaAkhir, String namaUser,
            String password) {
        if (nasabah == null) {
            nasabah = new LinkedList<>();
        }
        nasabah.add(new Nasabah(namaAwal, namaAkhir, namaUser, password,
                new Tabungan(0)));
    }

    public int getJumlahNasabah() {
        if (nasabah == null) {
            return 0;
        } else {
            return nasabah.size();
        }
    }

    public Nasabah getNasabah(int indeks) {
        return nasabah.get(indeks);
    }

    public void hapusNasabah(int indeks) {
        nasabah.remove(indeks);
    }

    public void editNasabah(int indeks, Nasabah nasabah) {
        this.nasabah.set(indeks, nasabah);
    }
    
    public String getNamaAwalAdmin(){
        return adminNamaAwal;
    }
    
    public String getNamaAkhirAdmin(){
        return adminNamaAkhir;
    }
    
    public int getIndexNasabah(String namaUser, String password) throws Exception{
        int i = 0;
        for(Nasabah n :this.nasabah){
            if(n.getNamaUser().equals(namaUser) && 
                    n.getPassword().equals(password)){
                
                return i;
            }
            i++;
        }
        
        throw new Exception("not found");
    }
    
    public int getIndexNasabah(String namaUser) throws Exception{
        int i = 0;
        for(Nasabah n :this.nasabah){
            if(n.getNamaUser().equals(namaUser)){
                return i;
            }
            i++;
        }
        
        throw new Exception("not found");
    }
}
