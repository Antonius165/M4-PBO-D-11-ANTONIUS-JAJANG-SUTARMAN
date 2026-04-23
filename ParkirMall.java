/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

/**
 *
 * @author LENOVO
 */
public class ParkirMall {
     // ATRIBUT
    private String jenisKendaraan;
    private int lama;
    private double total;

    // SETTER

    /**
     *
     * @param jenisKendaraan
     * @param lama
     */
    public void setData(String jenisKendaraan, int lama) {
        this.jenisKendaraan = jenisKendaraan;
        this.lama = lama;
    }

    // METHOD PERHITUNGAN
    public void hitungBiaya() {
        double tarifAwal;
        double tarifPerJam;

        if (jenisKendaraan.equalsIgnoreCase("motor")) {
            tarifAwal = 2000;
            tarifPerJam = 1000;
        } else if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            tarifAwal = 5000;
            tarifPerJam = 2000;
        } else {
            System.out.println("Jenis kendaraan tidak valid!");
            return;
        }

        total = tarifAwal + (lama * tarifPerJam);
    }

    // GETTER
    public double getTotal() {
        return total;
    }

    // METHOD OUTPUT
    public void tampil() {
        System.out.println("=== DATA PARKIR ===");
        System.out.println("Jenis Kendaraan : " + jenisKendaraan);
        System.out.println("Lama Parkir     : " + lama + " jam");
        System.out.println("Total Biaya     : Rp " + total);
    }
}
