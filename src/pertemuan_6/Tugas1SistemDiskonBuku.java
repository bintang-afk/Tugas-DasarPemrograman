package pertemuan_6;
import java.util.Scanner;
public class Tugas1SistemDiskonBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jenis   : ");
        String jenis = input.next();
        System.out.print("Jumlah  : ");
        int jumlah = input.nextInt();

        int diskon = 0;

        if (jenis.equalsIgnoreCase("kamus")) {
            diskon = 11;
            if (jumlah > 2) {
                diskon += 2;
            }
        } else if (jenis.equalsIgnoreCase("novel"))  {
            diskon = 5;
            if (jumlah > 3){
                diskon += 2;
            }else {
                diskon += 1;
            }
        } else if (jumlah > 3){
            diskon = 3;
        }
        System.out.println("Diskon  : " + diskon + "%");
        input.close();
    }
}
