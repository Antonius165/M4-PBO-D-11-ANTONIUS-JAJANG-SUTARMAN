/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import object.Laundry;

/**
 *
 * @author LENOVO
 */
public class LaundryMain {
    public static void main(String[] args) {
        Laundry l = new Laundry();
        l.setData(12, "express");
        l.hitungBiaya();
        l.tampil();
    }
}
