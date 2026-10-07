package pertemuan_7;
// • hargaPerCup = 15000 + (P mod 6) × 1000 → 17000
// • Syarat minimal belanja untuk diskon = 80000 + (P mod 5) × 10000 → 110000
// flowchart
// • Persentase diskon = 5 + (P mod 6) % → 7
// Struktur logika (urutan langkah pada flowchart) tetap sama, hanya ketiga angka di atas yang diganti
// sesuai P Anda.
import java.util.Scanner;

public class StudiKasus108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaPerCup = 18000 ;
        int jumlahCup, uangBayar ;
        int totalHarga, diskon, totalBayar ;
        int kembalian = 0;
        int kurang = 0;
        
        System.out.print("Masukkan jumlah cup  : ");
        jumlahCup = input.nextInt();
        System.out.print("Masukan uang bayar   : ");
        uangBayar = input.nextInt();
        totalHarga =jumlahCup * hargaPerCup ;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
        }

        totalBayar = totalHarga - diskon;
                
        System.out.println("Total harga          : "+ totalHarga);
        System.out.println("diskon               : "+ diskon);
        System.out.println("Total bayar          : "+ totalBayar);
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println(kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp "+kurang );
        }
        input.close();
    }
}
