package pertemuan_13;

import java.util.Scanner;
import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];
        
        myNumbers[0] = new int[7];
        
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.deepToString(myNumbers));
        }
        
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }
        System.out.println(myNumbers.length);
        System.out.println(myNumbers[0].length);
        input.close();
    }
}
