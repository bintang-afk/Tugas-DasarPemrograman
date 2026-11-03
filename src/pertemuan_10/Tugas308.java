package pertemuan_10;

import java.util.Scanner;

public class Tugas308 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jmlToko ;
        int jmlPelanggan;
        int jmlBarang = 0;

        int totalPelanggan= 0;
        int totalBarang= 0;
        int totalBarangTokoIni = 0 ;

        int maxBarangToko = -1; 
        int nomorTokoTerbanyak = 1;


        do {
            System.out.print("Masukkan jumlah toko : ");
            jmlToko = input.nextInt();
            if (jmlToko<1) {
                System.out.println("Toko minimal harus 1 !");
            }
        } while (jmlToko < 1);

        for (int i = 1; i <= jmlToko; i++) {    
            do {
                System.out.print("Masukkan jumlah pelanggan toko ke "+i+ " : ");
                jmlPelanggan = input.nextInt();
                if (jmlPelanggan < 0 ) {
                    System.out.println("jumlah pelanggan tidak boleh negatif !");
                }
            } while (jmlPelanggan < 0);
            
            for (int j = 1; j <= jmlPelanggan; j++) {
                do {
                    System.out.print(" <> Masukkan jumlah barang pelangggan ke "+j+" : ");
                    jmlBarang = input.nextInt();
                    if (jmlBarang < 0 ) {
                        System.out.println("  ! Jumlah barang tidak boleh negatif !");
                    }
                } while (jmlBarang < 0);
                totalBarangTokoIni += jmlBarang;
                totalBarang += jmlBarang;
            }
            totalPelanggan += jmlPelanggan;
            if (i == 1 || totalBarangTokoIni > maxBarangToko) {
                maxBarangToko = totalBarangTokoIni;
                nomorTokoTerbanyak = i;
            }
            System.out.println("Toko "+i+" - Pelanggan: "+jmlPelanggan+", total barang: "+totalBarangTokoIni);
            totalBarangTokoIni = 0;


            }
            System.out.println();
            System.out.println("Total barang seluruh toko    : "+ totalBarang);
            System.out.println("total pelanggan seluruh toko : " + totalPelanggan);
            System.out.println("toko dengan barang terbanyak : "+nomorTokoTerbanyak);
            input.close();
        }
    }

