/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan39.nilaiterbesardanterkecil;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program menghitung nilai terbesar dan terkecil dengan konsep 
 * pendekatan berbasis objek
 */
public class Nilai {
    private final List<Integer> nilai = new ArrayList();
    private int mahasiswa, terbesar, terkecil;
    
    public void setNilai(int nilai) {
        this.nilai.add(nilai);
    }

    public void setMahasiswa(int mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public int getMahasiswa() {
        return mahasiswa;
    }
    
    private void hitungNilaiTerbesar(int idx) {
        if(terbesar < nilai.get(idx))
            terbesar = nilai.get(idx);
    }
    
    private void hitungNilaiTerkecil(int idx) {
        if(terkecil > nilai.get(idx))
            terkecil = nilai.get(idx);
    }

    public void tampilNilai() {
        System.out.println();
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        
        terbesar = nilai.get(0);
        terkecil = nilai.get(0);
        
        for(int i = 0; i < nilai.size(); i++) {
            hitungNilaiTerbesar(i);
            hitungNilaiTerkecil(i);
            System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = "
                    + nilai.get(i));
        }
        
        // output hasil
        System.out.println("\nNilai Terbesar adalah " + terbesar);
        System.out.println("Nilai Terkecil adalah " + terkecil);
    } 
}
