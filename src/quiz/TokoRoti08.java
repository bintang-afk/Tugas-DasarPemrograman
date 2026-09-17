package quiz;
import java.util.Scanner;
public class TokoRoti08 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double hargaPerKotak = 27000;
    double biayaModal = 1801250;
    int labaPegawai = 4;
    int jumlahTerjual;
    double pendapatan ;
    double laba;
    double bagianPegawai;
    double sisaKas ;
    
    System.out.print("Masukkan jumlah terjual : ");
    jumlahTerjual = input.nextInt();

    pendapatan = jumlahTerjual * hargaPerKotak;

    laba = pendapatan - biayaModal; 

    bagianPegawai = laba / labaPegawai;

    sisaKas = laba % labaPegawai;

    System.out.println("Pendapatan \t: "+(int)pendapatan);
    System.out.println("Laba \t\t: "+(int)laba);
    System.out.println("Bagian pegawai \t: "+bagianPegawai);
    System.out.println("Sisa kas \t: "+(int)sisaKas);
    input.close();
// Masukkan jumlah terjual : 100 
// Pendapatan      : 2700000
// Laba            : 898750
// Bagian pegawai  : 224687.5
// Sisa kas        : 2
    }
  

}
