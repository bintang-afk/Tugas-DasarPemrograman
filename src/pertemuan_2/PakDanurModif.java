package pertemuan_2;
import java.util.Scanner;
public class PakDanurModif {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double gajiPokok;
        int jmlAnak;
        double tunjanganAnak = 100000;
        double potonganPensiun = 0.10;

        System.out.print("Masukan Gaji pokok : ");
        gajiPokok = input.nextDouble();
        System.out.print("Masukkan Jumlah anak : ");
        jmlAnak = input.nextInt();

        double totalTunjanganAnak = jmlAnak * tunjanganAnak ;
        double totalPotonganPesiun = gajiPokok * potonganPensiun;
        double gajiBersih = gajiPokok + totalTunjanganAnak - totalPotonganPesiun;

        
        System.out.printf("gaji bersih yang anda dapat adalah = %.2f",gajiBersih);
    }
}
