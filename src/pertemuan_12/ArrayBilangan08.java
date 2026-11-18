package pertemuan_12;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayBilangan08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int [] bil = {5,13,-7,17};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));
        input.close();
    }
}