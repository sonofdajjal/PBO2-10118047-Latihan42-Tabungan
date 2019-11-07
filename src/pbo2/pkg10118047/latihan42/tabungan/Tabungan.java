/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118047.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Abdullah Margani
 * Nim : 10118047
 * Kelas: IF-2
 */
public class Tabungan {
    private int saldo;

    Scanner input = new Scanner(System.in);
    
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Tabungan(int saldo) {
        System.out.print("Masukkan Saldo Awal : ");
        saldo = input.nextInt();
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = input.nextInt();
        int sisa = saldo-jumlah;
        System.out.println("Saldo Anda Sekarang : " + sisa);
        
        return sisa;
    }    

}
