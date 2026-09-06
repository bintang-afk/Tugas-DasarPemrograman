package pertemuan_2;

public class PakDanur08 {
    public static void main(String[] args) {
        double gajiPokok = 5000000;
        int jmlAnak = 4;
        double tunjanganAnak = 100000;
        double potonganPensiun = 0.10;
        double totalTunjanganAnak = jmlAnak * tunjanganAnak ;
        double totalPotonganPesiun = gajiPokok * potonganPensiun;
        double gajiBersih = gajiPokok + totalTunjanganAnak - totalPotonganPesiun;
        System.out.println("gaji bersih Pak Danur adalah = "+gajiBersih);
    }
}
