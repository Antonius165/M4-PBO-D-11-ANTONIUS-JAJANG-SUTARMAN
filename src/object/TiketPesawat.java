/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

/**
 *
 * @author LENOVO
 */
public class TiketPesawat {
    private String tujuan;
    private String kelas;
    private double harga;
    private double total;

    public void setData(String tujuan, String kelas) {
        this.tujuan = tujuan;
        this.kelas = kelas;
    }

    public void hitungHarga() {
        if (tujuan.equalsIgnoreCase("Jakarta")) {
            harga = 1000000;
        } else if (tujuan.equalsIgnoreCase("Bali")) {
            harga = 1500000;
        }

        if (kelas.equalsIgnoreCase("bisnis")) {
            harga *= 1.5;
        }

        total = harga + (harga * 0.1); // pajak
    }

    public void tampil() {
        System.out.println("Tujuan : " + tujuan);
        System.out.println("Kelas  : " + kelas);
        System.out.println("Total  : Rp " + total);
    }
}
