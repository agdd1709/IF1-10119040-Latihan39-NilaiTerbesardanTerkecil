/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program menghitung nilai terbesar dan terkecil dengan konsep 
 * pendekatan berbasis objek
 */
public class IF110119040Latihan39NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nilai nilai = new Nilai();
        Petugas petugas = new Petugas();
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil "
                + "Nilai Mahasiswa=====");
  
        System.out.print("Masukkan Nama Petugas : ");
        petugas.setNama(scanner.next());
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        nilai.setMahasiswa(scanner.nextInt());
        
        for(int i = 0; i < nilai.getMahasiswa(); i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+" = ");
            nilai.setNilai(scanner.nextInt());
        }
        
        nilai.tampilNilai();
        System.out.println("Petugas : " + petugas.getNama());
    }
    
}
