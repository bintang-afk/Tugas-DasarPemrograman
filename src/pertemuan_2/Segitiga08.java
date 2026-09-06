package pertemuan_2;
import java.util.Scanner;

public class Segitiga08 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int alas;
    int tinggi;
    

    System.out.print("Masukkan alas : ");
    alas = sc.nextInt();
    System.out.print("Masukkan tinggi : ");
    tinggi = sc.nextInt();
    
    float luas = alas * tinggi / 2 ;

    System.out.println("Luas segitiga: "+ luas);

    }    
}
