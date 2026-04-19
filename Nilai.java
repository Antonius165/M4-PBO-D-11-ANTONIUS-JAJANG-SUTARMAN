/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

/**
 *
 * @author LENOVO
 */
public class Nilai {
    //deklarasi atribute
    private String NIM, Nama;
    private float NilTugas1, NilTugas2, NilUTS, NilUAS, NilAkhir;
    private String NilGrade, Keterangan;
    
    //membuat method setter
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNilTugas1(float NilTugas1) {
        this.NilTugas1 = NilTugas1;
    }

    public void setNilTugas2(float NilTugas2) {
        this.NilTugas2 = NilTugas2;
    }

    public void setNilUTS(float NilUTS) {
        this.NilUTS = NilUTS;
    }

    public void setNilUAS(float NilUAS) {
        this.NilUAS = NilUAS;
    }
        
    //membuat method getter

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public float getNilTugas1() {
        return NilTugas1;
    }

    public float getNilTugas2() {
        return NilTugas2;
    }

    public float getNilUTS() {
        return NilUTS;
    }

    public float getNilUAS() {
        return NilUAS;
    }
    
 //membuat method menghitung Nilai Akhir
 public float HitungNilaiAkhir () {
    NilAkhir = (float) (getNilTugas1()*0.2+getNilTugas2()*0.2
            +getNilUTS()*0.3+getNilUAS()*0.3);
    return NilAkhir;
 }
 
 //membuat method menentukan grade nilai 
 public String CekGrade() {
    if(HitungNilaiAkhir()>=80) {
         NilGrade = "A";
    } else if(HitungNilaiAkhir()>=76) {
         NilGrade = "A-";
    } else if(HitungNilaiAkhir()>=72) {
         NilGrade = "B+"; 
    } else if(HitungNilaiAkhir()>=68) {
         NilGrade = "B";
    } else if(HitungNilaiAkhir()>=64) {
         NilGrade = "B-";
    } else if(HitungNilaiAkhir()>=60) {
         NilGrade = "C+";
    } else if(HitungNilaiAkhir()>=56) {
         NilGrade = "C";
    } else if(HitungNilaiAkhir()>=41) {
         NilGrade = "D";
    } else {
         NilGrade = "E";
    }
    return NilGrade;
}   
 
    //membuat method menampilkan keterangan
    public void CekKeterangan() {
        if(HitungNilaiAkhir()>56) {
            Keterangan = "LULUS";
            System.out.println("Keterangan     : "+Keterangan);
        } else {
            Keterangan = "TIDAK LULUS";
            System.out.println("Keterangan     : "+Keterangan);
        }
    }
}
