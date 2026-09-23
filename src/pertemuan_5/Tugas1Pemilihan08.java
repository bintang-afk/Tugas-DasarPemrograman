package pertemuan_5;
import java.util.Scanner;
public class Tugas1Pemilihan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" --- Cetak KRS SIAKAD --- ");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");

        boolean ukt = sc.nextBoolean();

        String pesan = ukt ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA" :
        "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu" ;

        System.out.println(pesan);
        

        sc.close();
    }
}
