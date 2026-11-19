package pertemuan_12;

import java.util.Scanner;

public class ArrayNilai08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int lulus = 0;
        int tidakLulus = 0;

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i : nilaiAkhir ) {
            if (i > 70) {
                System.out.println("nilai mahasiswa : " + i + " LULUS ");
                lulus++;
            }else {
                System.out.println("nilai mahasiswa : " + i + " TIDAK LULUS ");
                tidakLulus++;
            }
        }
        System.out.println("Mahasiswa Lulus adalah berjumlah : "+lulus);
        System.out.println("Mahasiswa tidak Lulus adalah berjumlah : "+tidakLulus);
        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
        //     System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" +status + ")");
        // }

        input.close();
    }
}