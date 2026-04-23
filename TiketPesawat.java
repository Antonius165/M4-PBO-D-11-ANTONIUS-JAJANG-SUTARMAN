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
     // ATRIBUT
    private String tujuan;
    private String kelas;
    private double harga;
    private double total;

    // SETTER
    public void setData(String tujuan, String kelas) {
        this.tujuan = tujuan;
        this.kelas = kelas;
    }

    // METHOD PERHITUNGAN
    public void hitungHarga() {

        // menentukan harga berdasarkan tujuan
        if (tujuan.equalsIgnoreCase("Jakarta")) {
            harga = 1200000;
        } else if (tujuan.equalsIgnoreCase("Bali")) {
            harga = 1750000;
        } else {
            System.out.println("Tujuan tidak valid!");
            return;
        }

        // tambahan harga jika kelas bisnis
        if (kelas.equalsIgnoreCase("bisnis")) {
            harga *= 1.5;
        } else if (!kelas.equalsIgnoreCase("ekonomi")) {
            System.out.println("Kelas tidak valid!");
            return;
        }

        // hitung total + pajak 10%
        total = harga + (harga * 0.1);
    }

    // GETTER
    public double getTotal() {
        return total;
    }

    // OUTPUT
    public void tampil() {
        System.out.println("=== DATA TIKET PESAWAT ===");
        System.out.println("Tujuan : " + tujuan);
        System.out.println("Kelas  : " + kelas);
        System.out.println("Total  : Rp " + total);
    }
}