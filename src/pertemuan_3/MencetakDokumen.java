package pertemuan_3;
import java.util.Scanner;
public class MencetakDokumen {
    public static void main(String[] args) {
        Scanner bintang = new Scanner(System.in);
        int jmlLembar; 
        int biayaPerLembar = 500;
        int biayaJilid = 5000;
        int biayaCetak;
        double totalBiaya;

        System.out.print("Masukkan jumlah lembar dokumen : ");
        jmlLembar = bintang.nextInt();

        biayaCetak = jmlLembar * biayaPerLembar;
        totalBiaya = biayaCetak + biayaJilid;

        System.out.println("Maka total biaya yang harus anda bayar adalah "+totalBiaya);

        bintang.close();
    }
}
