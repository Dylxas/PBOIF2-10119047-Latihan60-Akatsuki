/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENAMPILKAN ANGGOTA AKATSUKI
 */

public class Akatsuki {
        protected String nama;
        protected String partner;
        protected String asalDesa;

     public Akatsuki() {
        System.out.println("--------------AKATSUKI--------------");
        System.out.println("Daftar Anggota :");
        System.out.println("1. Pein");
        System.out.println("2. Konan");
        System.out.println("3. Kisame");
        System.out.println("4. Zetsu");
        System.out.println("5. Tobi");
        System.out.println("6. Deidara");
        System.out.println("7. Hidan");
        System.out.println("8. Kakuzu");
        System.out.println("9. Sasori");
        System.out.println("10. Itachi");
    }

    public String getNama() {
        return nama;
    }

    public String getPartner() {
        return partner;
    }

    public String getAsalDesa() {
        return asalDesa;
    }

    public int pilihAnggota() {
        System.out.print("\nPilih Karakter : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
