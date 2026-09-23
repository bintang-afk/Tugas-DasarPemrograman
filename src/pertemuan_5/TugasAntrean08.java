package pertemuan_5;
import java.util.Scanner;;
public class TugasAntrean08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kodeLayanan;


        System.out.println("---MESIN ANTREAN AKADEMIK---");
        System.out.print("Masukkan kode layanan (1-4): ");
        kodeLayanan = sc.nextInt();

        switch (kodeLayanan) {
            case 1:
                System.out.println("Legalisir Ijazah, Loket A");
                break;
            case 2:
                System.out.println("Surat keterangan Aktif Kuliah, Loket B");
                break;
            case 3:
                System.out.println("Pembayaran UKT, Loket C");
                break;
            case 4:
                System.out.println("Pengajuan Cuti Akademik, Loket D");
                break;
            default:
                System.out.println("Kode tidak valid");
                break;

        
        }
    
    sc.close();
    }

}
