package pertemuan_12;

import java.util.Scanner;

public class SearchNilai08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak nya element array nilai : ");
        int banyakArray = input.nextInt();

        int[] nilai = new int[banyakArray];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai array ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.print("Masukkan key yang ingin anda cari : ");
        int key = input.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("\nNilai " + key + " tidak ditemukan.");
            System.out.println("nilai yang dicari : "+key);
            System.out.println("nilai : "+key+" Tidak ditemukan dalam "+banyakArray+" elemet array !");
        } 
        input.close();
    }
}

