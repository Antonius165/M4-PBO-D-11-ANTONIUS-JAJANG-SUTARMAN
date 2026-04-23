/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

/**
 *
 * @author LENOVO
 */
public class Laundry {
    private double berat;
    private String jenis;
    private double total;

    public void setData(double berat, String jenis) {
        this.berat = berat;
        this.jenis = jenis;
    }

    public void hitungBiaya() {
        double hargaPerKg = 0;

        if (jenis.equalsIgnoreCase("reguler")) {
            hargaPerKg = 7000;
        } else if (jenis.equalsIgnoreCase("express")) {
            hargaPerKg = 10000;
        }

        total = berat * hargaPerKg;

        // diskon
        if (berat > 10) {
            total *= 0.9;
        }
    }

    public void tampil() {
        System.out.println("Jenis Laundry : " + jenis);
        System.out.println("Berat         : " + berat + " kg");
        System.out.println("Total Biaya   : Rp " + total);
    }
}
