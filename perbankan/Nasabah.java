/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author mamir
 */
public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    
    public Nasabah(String namaAwal, String namaAkhir, Tabungan tabungan){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
        this.tabungan = tabungan;
    }
    
    
    public String getNamaAwal(){
        return namaAwal;
    }
    
    public String getNamaAkhir(){
        return namaAkhir;
    }
    public Tabungan getTabungan(){
        return tabungan;
    }
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
}
