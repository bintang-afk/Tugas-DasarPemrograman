// • Tarif parkir mobil = 2500 + (P mod 6) × 250 per jam → 3_000 gantikan Rp3.000 pada soal
// • Tarif parkir motor = 1500 + (P mod 6) × 250 per jam -> 2_000 (gunakan nilai (P mod 6) yang SAMA
// dengan tarif mobil) → gantikan Rp2.000 pada soal

package pertemuan_9;

import java.util.Scanner;

public class TempatParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis , durasi , total =0;

        do {
            System.out.print("Masukkan jenis kendaraaan (1 untuk mobil dan 2 untuk motor,0 untuk keluar) : ");
            jenis = input.nextInt();
            if (jenis == 1 || jenis == 2 ) {
                System.out.print("Masukkan durasi anda : ");
                durasi = input.nextInt();

                if (jenis == 1) {
                    total += durasi*3_000;
                } else {
                    total += durasi*2_000;
                }
            }

        } while (jenis != 0);

        System.out.println("Total parkir anda adalah : "+total);
        input.close();
    }
}    

