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
    private String jenisKendaraan;
    private int lama;
    private double total;

    public void setData(String jenisKendaraan, int lama) {
        this.jenisKendaraan = jenisKendaraan;
        this.lama = lama;
    }

    public void hitungBiaya() {
        double tarifAwal = 0;
        double tarifPerJam = 0;

        if (jenisKendaraan.equalsIgnoreCase("motor")) {
            tarifAwal = 2000;
            tarifPerJam = 1000;
        } else if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            tarifAwal = 5000;
            tarifPerJam = 2000;
        }

        total = tarifAwal + (lama * tarifPerJam);
    }

    public void tampil() {
        System.out.println("Jenis Kendaraan : " + jenisKendaraan);
        System.out.println("Lama Parkir     : " + lama + " jam");
        System.out.println("Total Biaya     : Rp " + total);
    }
}
