// 4.1. Tugas 1 — Pengelolaan Nilai Mahasiswa
// Buatlah program yang dapat menyimpan dan mengelola nilai mahasiswa (bilangan bulat). Program harus
// menyediakan fitur untuk:
// • Memasukkan banyaknya nilai mahasiswa yang akan diinput.
// • Memasukkan setiap nilai mahasiswa satu per satu.
// • Menghitung nilai rata-rata dari seluruh nilai yang dimasukkan.
// • Menampilkan nilai tertinggi dan nilai terendah.
// • Menampilkan semua nilai yang telah dimasukkan, beserta status kelulusannya (LULUS / TIDAK LULUS)

package pertemuan_12;

import java.util.Scanner;

public class Tugas108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int banyakMhs ;
        double total = 0;
        double rataRata;
        
        do {
            System.out.print("Masukkan banyaknya mahasiswa yang akan di input nilainya : ");
            banyakMhs = input.nextInt();
            if (banyakMhs <= 0) {
                System.out.println("data tidak valid masukkan ulang !");
            }
        } while (banyakMhs <= 0);
        
        double [] nilaiMhs = new double[banyakMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            do {
                System.out.print("Masukkan nilai mahasiswa ke "+(i+1)+" : ");
                nilaiMhs[i] = input.nextDouble();
                if (nilaiMhs[i] > 100 || nilaiMhs[i] < 0) {
                    System.out.println("nilai tidak valid Masukkan ulang !");
                }
            } while (nilaiMhs[i] > 100 || nilaiMhs[i] < 0);
            total += nilaiMhs[i];
        }

        rataRata = total / banyakMhs;

        double nilaiTertingi = nilaiMhs[0];
        double nilaiTerendah = nilaiMhs[0];
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaiTertingi) {
                nilaiTertingi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        System.out.println("\n=============== NILAI ===============");
        System.out.println("Rata rata nilai mahasiswa adalah : "+rataRata);
        System.out.println("Nilai Tertinggi : "+ nilaiTertingi);
        System.out.println("Nilai Terendah : "+ nilaiTerendah);
        
        System.out.println("\n============== STATUS ===============");
        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] >= 50 ) ? "LULUS" : "TIDAK LULUS";
            System.out.println("status mahasiswa ke "+(i+1)+" adalah : "+status);
        }
        input.close();
    }
}