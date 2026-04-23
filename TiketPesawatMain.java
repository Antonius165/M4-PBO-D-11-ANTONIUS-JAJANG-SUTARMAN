/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import object.TiketPesawat;



/**
 *
 * @author LENOVO
 */
public class TiketPesawatMain {
   public static void main(String[] args) {

       try (Scanner input = new Scanner(System.in)) {
           TiketPesawat t = new TiketPesawat();
           
           // INPUT
           System.out.print("Masukkan tujuan (Jakarta/Bali): ");
           String tujuan = input.nextLine();
           
           System.out.print("Masukkan kelas (ekonomi/bisnis): ");
           String kelas = input.nextLine();
           
           // PROSES
           t.setData(tujuan, kelas);
           t.hitungHarga();
           
           // OUTPUT
           t.tampil();
       }
    }
}
