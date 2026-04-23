/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import object.ParkirMall;

/**
 *
 * @author LENOVO
 */
public class ParkirMallMain {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            ParkirMall p = new ParkirMall();
            
            // INPUT
            System.out.print("Masukkan jenis kendaraan (motor/mobil): ");
            String jenis = input.nextLine();
            
            System.out.print("Masukkan lama parkir (jam): ");
            int lama = input.nextInt();
            
            // PROSES
            p.setData(jenis, lama);
            p.hitungBiaya();
            
            // OUTPUT
            p.tampil();
        }
    }
}