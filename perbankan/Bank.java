/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

import java.util.LinkedList;

/**
 *
 * @author mamir
 */
public class Bank {

    LinkedList<Nasabah> nasabah;

    public Bank() {
    }

    public void tambahNasabah(String namaAwal, String namaAkhir) {
        if (nasabah == null) {
            nasabah = new LinkedList<>();
        }
        nasabah.add(new Nasabah(namaAwal, namaAkhir));
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
        this.nasabah.set(indeks,nasabah);
    }
}
