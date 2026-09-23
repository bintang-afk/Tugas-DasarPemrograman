
package pertemuan_1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class wow {
  
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double jumlahTabunganAwal;
    int lamaMenabung;
    double bunga = 0.02;
    double nominalBunga;
    double totalTabunganAkhir;
    DecimalFormat df = new DecimalFormat("#");
    System.out.print("Masukkan jumlah tabungan awal : ");
    jumlahTabunganAwal = input.nextDouble();
    System.out.print("Masukkan lama menabung : ");
    lamaMenabung = input.nextInt();

    nominalBunga = lamaMenabung * bunga * jumlahTabunganAwal;
    totalTabunganAkhir = jumlahTabunganAwal + nominalBunga;
    String hasilFormat = df.format(totalTabunganAkhir);

    System.out.println(nominalBunga);
    System.out.println(hasilFormat);
    
input.close();

}
}

