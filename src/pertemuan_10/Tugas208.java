package pertemuan_10;

import java.util.Scanner;

public class Tugas208 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n : ");
        int n = input.nextInt();
        int hasil = 1;
        int total = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                hasil = i*j ;
                System.out.printf("%4d", hasil);
                total += hasil ;
            }
            hasil = 1;
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: "+total);
        input.close();
    }
}