/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan60.akatsuki;

import java.util.Scanner;

/**
 *	
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program dengan pendekatan berbasis objek untuk menampilkan
 * keanggotaan akatsuki berdasarkan desa atau asal
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Akatsuki akatsuki = new Akatsuki();
        
        System.out.println("===Tokoh Akatsuki Berdasarkan Desa/Asal===");
        akatsuki.tampilDaftarDesa();
        akatsuki.setDesa(sc.nextInt());
        
        System.out.println("");
        
        akatsuki.tampilAnggotaDesa(akatsuki.getDesa());
    }
    
}
