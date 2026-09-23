package pertemuan_5;
import java.util.Scanner;
public class TugasParkir08 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lamaParkir ;
        int tarif;

        System.out.print("Masukkan lama parkir anda : ");
        lamaParkir = sc.nextInt();

        if (lamaParkir <= 2) {
            tarif = 2000;
        } else {
            tarif = 2000 + (lamaParkir - 2 )*1000;
        }
    
        System.out.printf("Biaya parkir anda adalah : %d", tarif);

    }

}
