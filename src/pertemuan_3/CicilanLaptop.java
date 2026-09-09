package pertemuan_3;
import java.util.Scanner;
public class CicilanLaptop {
    public static void main(String[] args) {
        Scanner bintang = new Scanner(System.in);
        double harga;
        double dp;
        double sisaHarga;
        double bunga = 0.02;
        double bungaPerBulan;
        double pokokCicilan;
        double cicilanPerBulan;
        int lamaCicilan;

        System.out.print("Masukkan harga : ");
        harga = bintang.nextDouble();
        System.out.print("Masukkan dp : ");
        dp = bintang.nextDouble();
        System.out.print("Masukkan lama cicilan : ");
        lamaCicilan = bintang.nextInt();

        sisaHarga = harga - dp;
        pokokCicilan = sisaHarga / lamaCicilan;
        bungaPerBulan = sisaHarga * bunga;
        cicilanPerBulan = pokokCicilan + bungaPerBulan;

        System.out.printf("Maka cicilan yang harus kamu bayar adalah %.2f per bulan",cicilanPerBulan);
    }
}
