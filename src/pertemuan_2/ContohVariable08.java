package pertemuan_2;
public class ContohVariable08 {
    public static void main(String[] args) {
        String hoby = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umur = 20;
        double ipk = 3.24;
        double tinggi = 1.78;

        System.out.println(hoby);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}