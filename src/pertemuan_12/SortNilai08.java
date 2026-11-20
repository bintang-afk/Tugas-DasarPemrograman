package pertemuan_12;

import java.util.Arrays;
import java.util.Scanner;

public class SortNilai08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        int[] nilai = {28, 43, 20, 58, 8, 33};
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        } 
System.out.println(Arrays.toString(nilai));

        input.close();
    }
}
