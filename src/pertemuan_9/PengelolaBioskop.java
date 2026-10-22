// • Harga tiket = 40000 + (P mod 6) × 2000 → 44.000 gantikan Rp50.000 pada soal
// • Syarat diskon pertama = lebih dari (3 + (P mod 3)) 5 tiket, dengan diskon (8 + (P mod 5))% → 11 %
// gantikan "lebih dari 4 tiket, diskon 10%"
// • Syarat diskon kedua = lebih dari (8 + (P mod 4)) 8 tiket, dengan diskon (15 + (P mod 4))% →15 %
// gantikan "lebih dari 10 tiket, diskon 15%"


// 1. Seorang pengelola bioskop ingin membuat program untuk menghitung total penjualan
// tiket dalam satu hari. Tiket dijual dengan harga Rp 50.000 per tiket [GANTI SESUAI
// PARAMETER UNIK ANDA]. Program harus menghitung total tiket yang terjual dan total
// harga penjualan tiket selama satu hari dengan ketentuan sebagai berikut:
// • Jika pelanggan membeli lebih dari 5 tiket, pelanggan mendapatkan diskon 11%
// [GANTI SESUAI PARAMETER UNIK ANDA].
// • Jika pelanggan membeli lebih dari 8 tiket, pelanggan mendapatkan diskon 15%
// [GANTI SESUAI PARAMETER UNIK ANDA].
// • Jika input jumlah tiket tidak valid (negatif), program akan mengabaikan input
// tersebut dan meminta input ulang.
package pertemuan_9;
import java.util.Scanner;

public class PengelolaBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double hargaTiket = 44_000;
        double totalBayar = 0;
        double bayar ;
        double diskon = 0;
        double penguranganDiskon = 0 ;
        int totalTiket= 0;
        double totalPendapatanHariINi = 0;
        int jmlTiket ;

        do {
            System.out.print("Masukkan berapa tiket yang mau anda beli / masukkan 0 jika ingin mengentikan program : ");
            jmlTiket = input.nextInt();
            
            if (jmlTiket == 0) {
                System.out.println("program berhenti !");
                break;
            }

            if (jmlTiket < 0) {
                System.out.println("Tiket tidak valid masukkan ulang");
                continue;
            }else if (jmlTiket > 8 ){
                diskon = 0.15 ;
            }else if (jmlTiket > 5) {
                diskon = 0.11;
            }else{
                diskon =0 ;
            }
            

            bayar = jmlTiket *hargaTiket;
            penguranganDiskon = bayar * diskon;
            totalBayar = bayar - penguranganDiskon;
            totalPendapatanHariINi += totalBayar;
            totalTiket += jmlTiket;

            System.out.println("======hasil======");
            System.out.println("Jumlah tiket                              : "+jmlTiket);
            System.out.println("total bayar anda                          : "+totalBayar);
            System.out.println("pembeli mendapatakan diskon sebesar       : "+(diskon*100)+"%");
            System.out.println("akumulasi jumlah tiket harian adalah      : "+totalTiket);
            System.out.println("total pendapatan hari ini                 : "+totalPendapatanHariINi);

        } while (true);        
        input.close();
    }
}