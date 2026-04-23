/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import object.TiketPesawat;

/**
 *
 * @author LENOVO
 */
public class TiketPesawatMain {
   public static void main(String[] args) {
        TiketPesawat t = new TiketPesawat();
        t.setData("Bali", "bisnis");
        t.hitungHarga();
        t.tampil();
    } 
}
