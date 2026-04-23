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
    // DEKLARASI ATRIBUT (variabel dalam class)
    // digunakan untuk menyimpan data
    private double berat;
    private String jenis;
    private double total;

    // METHOD SETTER
    // digunakan untuk mengisi nilai atribut dari luar class
    public void setData(double berat, String jenis) {
        this.berat = berat;
        this.jenis = jenis;
    }

    // METHOD PERHITUNGAN
    // digunakan untuk memproses dan menghitung biaya laundry
    public void hitungBiaya() {
        double hargaPerKg = 0;

        if (jenis.equalsIgnoreCase("reguler")) {
            hargaPerKg = 7500;
        } else if (jenis.equalsIgnoreCase("express")) {
            hargaPerKg = 10000;
        }

        total = berat * hargaPerKg;

        // diskon jika lebih dari 10 kg
        if (berat > 10) {
            total *= 0.9;
        }
    }

    // METHOD GETTER
    // digunakan untuk mengambil nilai dari atribut
    public double getTotal() {
        return total;
    }

    // METHOD MENAMPILKAN (OUTPUT)
    // digunakan untuk menampilkan hasil ke layar
    public void tampil() {
        System.out.println("=== DATA LAUNDRY ===");
        System.out.println("Jenis Laundry : " + jenis);
        System.out.println("Berat         : " + berat + " kg");
        System.out.println("Total Biaya   : Rp " + total);
    }
}
