package pertemuan_5;
import java.util.Scanner;
public class Tugas2Pemilihan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahSks;

        System.out.print("Masukkan berapa jumlah sks anda : ");
        jumlahSks = sc.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }
    sc.close();
    }
}
