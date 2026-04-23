/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import object.Nilai;

/**
 *
 * @author LENOVO
 */
public class NilaiMain {
    public static void main(String[] args) {
        
        //membuat object dengan nama input melalui class scanner
        Scanner input = new Scanner (System.in);
        
        //membuat object dengan mhs melalui class Nilai
        Nilai mhs = new Nilai();
        
        //membuat tampilan input
        System.out.println("### INPUT NILAI MAHASISWA ##");
        System.out.print("NIM              : ");
        String NIM = input.nextLine();
        System.out.print("Nama Mahasiswa   : ");
        String nama = input.nextLine();
        System.out.print("Nilai Tugas 1    : ");
        float niltgs1 = input.nextFloat();
        System.out.print("Nilai Tugas 2    : ");
        float niltgs2 = input.nextFloat();
        System.out.print("Nilai UTS        : ");
        float niluts = input.nextFloat();
         System.out.print("Nilai UAS       : ");
        float niluas = input.nextFloat();
        
        //memanggil method setter melalui object mhs
        mhs.setNIM(NIM);
        mhs.setNama(nama);
        mhs.setNilTugas1(niltgs1);
        mhs.setNilTugas2(niltgs2);
        mhs.setNilUTS(niluts);
        mhs.setNilUAS(niluas);
        
        //membuat tampilan untuk output
        //dan memanggil method getter dan method tambahan melalui object mhs
        System.out.println("NIM             : "+mhs.getNIM());
        System.out.println("Nama Mahasiswa  : "+mhs.getNama());
        System.out.println("Nilai Tugas 1   : "+mhs.getNilTugas1());
        System.out.println("Nilai Tugas 2   : "+mhs.getNilTugas2());
        System.out.println("Nilai UTS       : "+mhs.getNilUTS());
        System.out.println("Nilai UAS       : "+mhs.getNilUAS());
        System.out.println("### ------------------------------ ###");
        System.out.println("Nilai Akhir     : "+mhs.HitungNilaiAkhir());
        System.out.println("Grade           : "+mhs.CekGrade());
        mhs.CekKeterangan();
    }
}
