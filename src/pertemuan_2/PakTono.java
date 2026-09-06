package pertemuan_2;

public class PakTono {
    public static void main(String[] args) {
        double lebarTanah = 100;
        double panjangTanah = 30;
        double diameterKolam = 5;
        double jariJariKolam = diameterKolam / 2;
        double sisiTaman = 2;
        
        double totalLuasTanah = panjangTanah * lebarTanah;
        double totalLuasKolam = Math.PI * jariJariKolam * jariJariKolam;
        double totalLuasTaman = sisiTaman * sisiTaman;

        double luasTanahKosong = totalLuasTanah - (totalLuasKolam + totalLuasTaman);
        System.out.printf("Luas tanah kosong milik pak tono adalah %.2f",luasTanahKosong);
    }
}
