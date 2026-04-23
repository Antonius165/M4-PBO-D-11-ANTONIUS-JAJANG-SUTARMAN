/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import object.Laundry;

/**
 *
 * @author LENOVO
 */
public class LaundryMain {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Laundry l = new Laundry();

        // input dari user
        System.out.print("Masukkan jenis laundry (reguler/express): ");
        String jenis = input.nextLine();

        System.out.print("Masukkan berat (kg): ");
        double berat = input.nextDouble();

        // proses OOP
        l.setData(berat, jenis);
        l.hitungBiaya();

        // output
        l.tampil();

        input.close();
    }
}
