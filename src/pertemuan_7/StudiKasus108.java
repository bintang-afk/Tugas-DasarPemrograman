package pertemuan_7;

import java.util.Scanner;

public class StudiKasus108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaPerCup = 17000 ;
        int jumlahCup, uangBayar ;
        int totalHarga, diskon, totalBayar ;
        int kembalian = 0;
        int kurang = 0;
        
        System.out.print("Masukkan jumlah cup  : ");
        jumlahCup = input.nextInt();
        System.out.print("Masukan uang bayar   : ");
        uangBayar = input.nextInt();
        totalHarga =jumlahCup * hargaPerCup ;
        diskon = 0;

        if (totalHarga >= 110000) {
            diskon = totalHarga * 7/100;
        }

        totalBayar = totalHarga - diskon;
                
        System.out.println("Total harga          : "+ totalHarga);
        System.out.println("diskon               : "+ diskon);
        System.out.println("Total bayar          : "+ totalBayar);
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println(kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp "+kurang );
        }
        input.close();
    }
}
