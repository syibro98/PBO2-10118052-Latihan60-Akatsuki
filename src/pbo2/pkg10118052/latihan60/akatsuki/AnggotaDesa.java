/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan60.akatsuki;

/**
 *	
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program dengan pendekatan berbasis objek untuk menampilkan
 * keanggotaan akatsuki berdasarkan desa atau asal
 */
public class AnggotaDesa {
    private final String konoha, ame, iwa, suna, kiri, yu, taki, otsutsuki;
    private int desa;
    
    public AnggotaDesa() {
        konoha = "1. Itachi Uchiha\n2. Obito Uchiha\n3. Orochimaru";
        ame = "1. Pain\n2. Konan";
        iwa = "1. Deidara";
        suna = "1. Sasori";
        kiri = "1. Kisame";
        yu = "1. Hidan";
        taki = "1. Kakuzu";
        otsutsuki = "1. Zetsu";
    }

    public int getDesa() {
        return desa;
    }

    public void setDesa(int desa) {
        this.desa = desa;
    }
    
    public void tampilDaftarDesa() {
        System.out.println("1. Konohagakure");
        System.out.println("2. Amegakure");
        System.out.println("3. Iwagakure");
        System.out.println("4. Sunagakure");
        System.out.println("5. Kirigakure");
        System.out.println("6. Yugakure");
        System.out.println("7. Takigakure");
        System.out.println("8. Otsutsuki");
        System.out.println("9. Semua Desa/Asal");
        System.out.print("Pilih Nomor Desa/Asal [1-9] : ");
    }
    
    public String getNamaDesa(int desa) {
        String result;
        switch(desa) {
            case 1: result = "Konohagakure"; break;
            case 2: result = "Amegakure"; break;
            case 3: result = "Iwagakure"; break;
            case 4: result = "Sunagakure"; break;
            case 5: result = "Kirigakure"; break;
            case 6: result = "Yugakure"; break;
            case 7: result = "Takigakure"; break;
            case 8: result = "Otsutsuki"; break;
            default: result = "Semua Desa / Asal"; break;
        }
        return result;
    }
    
    public String getAnggotaDesa(int desa) {
        String result;
        switch(desa) {
            case 1: result = konoha; break;
            case 2: result = ame; break;
            case 3: result = iwa; break;
            case 4: result = suna; break;
            case 5: result = kiri; break;
            case 6: result = yu; break;
            case 7: result = taki; break;
            default: result = otsutsuki; break;
        }
        return result;
    }
    
    public void tampilAnggotaDesa() {
        System.out.println("Konohagakure : ");
        System.out.println(getAnggotaDesa(1));
        System.out.println("\nAmegakure : ");
        System.out.println(getAnggotaDesa(2));
        System.out.println("\nIwagakure : ");
        System.out.println(getAnggotaDesa(3));
        System.out.println("\nSunagakure : ");
        System.out.println(getAnggotaDesa(4));
        System.out.println("\nKirigakure : ");
        System.out.println(getAnggotaDesa(5));
        System.out.println("\nYugakure : ");
        System.out.println(getAnggotaDesa(6));
        System.out.println("\nTakigakure : ");
        System.out.println(getAnggotaDesa(7));
        System.out.println("\nOtsutsuki : ");
        System.out.println(getAnggotaDesa(8));
    }
}
