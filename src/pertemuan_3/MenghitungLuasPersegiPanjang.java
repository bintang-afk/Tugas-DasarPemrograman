package pertemuan_3;
import java.util.Scanner;
public class MenghitungLuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;
        System.out.print("Masukkan Panjang : ");
        panjang = sc.nextInt();
        System.out.print("Masukkan Lebar : ");
        lebar = sc.nextInt();

        luas = panjang*lebar;
        System.out.println("Luas persegi panjang " +luas);

        sc.close();
    }
}
