// • hargaKopi = 10000 + (8 mod 5) × 1000 → gantikan Rp13.000 pada soal
// • hargaTeh = 5000 + (8 mod 4) × 1000 → gantikan Rp5.000 pada soal
// • hargaRoti = 15000 + (8 mod 6) × 1000 → gantikan Rp17.000 pada soal
package pertemuan_9;

import java.util.Scanner;

public class KafeDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int kopi , teh , roti ;
        String namaPelanggan ;
        int hargakopi = 13000, hargaTeh = 5000 , hargaRoti = 17000 , totalHarga;
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar):");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi dibatalkan.");
            break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System. out.print("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargakopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System. out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
            
                        
        } while (true);
        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}