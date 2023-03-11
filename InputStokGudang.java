/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputStokGudang;
/**
 *
 * @author ASUS
 */

// import Scanner untuk membaca input dari user
import java.util.Scanner; 
// package java.math digunakan untuk pembulatan angka dibelakang koma
import java.math.BigDecimal; 
import java.math.RoundingMode;

public class InputStokGudang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        // Mendeklarasikan variable
        String nama, barang;
        int qty;
        double hargabeli, hargajual;
        
        System.out.print("Masukan Nama Anda: ");
        nama = input.next();
        
        System.out.println("");
        
        System.out.println("Stok Gudang Input Barang");
        System.out.println("########################");
        
        System.out.println("Selamat Datang " + nama);
        
        System.out.print("Masukan nama barang yang mau ditambah: ");
        barang = input.next();
        
        System.out.print("Masukan Jumlah barang yang mau ditambah: ");
        qty = input.nextInt();
        
        System.out.print("Masukan harga beli untuk barang tersebut: ");
        hargabeli = input.nextDouble();
        
        System.out.print("Masukan harga jual untuk barang tersebut: ");
        hargajual = input.nextDouble();
        
        System.out.println("");
        
        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("##########################");
        
        // Membulatkan angka dibelakang koma
        BigDecimal hargabeli1 = new BigDecimal(hargabeli).setScale
        (2, RoundingMode.CEILING);
        BigDecimal hargajual1 = new BigDecimal(hargajual).setScale
        (2, RoundingMode.CEILING);
        
        System.out.println("Nama Barang     : " + barang);
        System.out.println("Jumlah Barang   : " + qty);
        System.out.println("Harga Beli      : Rp " + hargabeli1);
        System.out.println("Harga Jual      : Rp " + hargajual1);
        
    }
}
