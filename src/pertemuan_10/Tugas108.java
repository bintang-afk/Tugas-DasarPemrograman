package pertemuan_10;

import java.util.Scanner;

public class Tugas108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt();

        int angka = 1;
        int update = 0;
    
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((angka++) +" ");
                update++;
            }
            angka = 1;
            System.out.println();
        }
        System.out.println("Total angka tercetak: "+update);
        input.close();
    }
    
}
