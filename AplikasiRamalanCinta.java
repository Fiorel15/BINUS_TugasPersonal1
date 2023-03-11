/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RamalanCinta;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;
import java.util.Random;
        
public class AplikasiRamalanCinta {
    
    public static void main(String[] args) {
     // Memanggil package
    Scanner input = new Scanner(System.in);
    Random rndm = new Random();
    
    String nama1, nama2;
    int umur1, umur2;
    int low = 50;
    int high = 101;
    
    
     // Untuk mengambil angka random
    int x = rndm.nextInt(high - low) + low;
    
    System.out.println("Selamat Datang di Program Ramalan Cinta");
    System.out.println("+++++++++++++++++++++++++++++++++++++++");

    System.out.println("");
    
    System.out.println("Data Anda: ");
    System.out.println("***********");
    System.out.print("Masukan Nama Anda : ");
    nama1 = input.next();
    System.out.print("Masukan Umur Anda : ");
    umur1 = input.nextInt();

    System.out.println("");

    System.out.println("Data Pasangan Anda: ");
    System.out.println("********************");
    System.out.print("Masukan Nama Pasangan Anda : ");
    nama2 = input.next();
    System.out.print("Masukan Umur Pasangan Anda : ");
    umur2 = input.nextInt();

    System.out.println("");

    System.out.println(nama1 + " [" + umur1 + "] " + "tahun");
    
    
    // Logic perulangan u/menampilkan bentuk hati
        for (int i = 1; i <= 2; i++) {
            for (int k = 1; k <= 2 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (2 - i + 1) - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (5 - i + 1) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(nama2 + " [" + umur2 + "] " + "tahun");

        System.out.println("");

        System.out.print("Tekan ENTER untuk melihat hasil ramalan.....");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();

        System.out.println("");

        System.out.println("Kecocokan anda dengan pasangan anda adalah: " + x + "%");

        System.out.println("");

        System.out.println("Terima Kasih karena anda telah menggunakan jasa ramalan kami ^-^");
    
    }
}
