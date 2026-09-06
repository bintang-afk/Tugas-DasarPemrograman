package pertemuan_2;
import java.util.Scanner;
public class PakTonoModif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lebarTanah;
        double panjangTanah;
        double diameterKolam;
        double sisiTaman;
        
        System.out.print("Masukkan lebar tanah anda : ");
        lebarTanah = input.nextDouble();
        System.out.print("Masukkan panjang tanah anda : ");
        panjangTanah = input.nextDouble();
        System.out.print("Masukkan diameter kolam anda : ");
        diameterKolam = input.nextDouble();
        System.out.print("Masukkan sisi taman anda : ");
        sisiTaman = input.nextDouble();
        
        double jariJariKolam = diameterKolam / 2;
        double totalLuasTanah = panjangTanah * lebarTanah;
        double totalLuasKolam = Math.PI * jariJariKolam * jariJariKolam;
        double totalLuasTaman = sisiTaman * sisiTaman;

        double luasTanahKosong = totalLuasTanah - (totalLuasKolam + totalLuasTaman);
        System.out.printf("Luas tanah kosong milik anda adalah %.2f meter",luasTanahKosong);
    }
}
