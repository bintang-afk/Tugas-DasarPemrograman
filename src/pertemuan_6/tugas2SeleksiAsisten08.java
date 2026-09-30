package pertemuan_6;
import java.util.Scanner;

public class tugas2SeleksiAsisten08 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int absen = 8;

        int nilaiMinDaspro = 75 + (absen % 11);
        int nilaiMinWawancara = 70 + (absen % 11);

        System.out.print("Apakah anda berstatus aktif sebagai mahasiswa (ya/tidak) : ");
        String status = input.next();
        System.out.print("Apakah anda terkena sanksi Akademik (ya/tidak): ");
        String sanksiAkademik = input.next();

        if (status.equalsIgnoreCase("ya") && sanksiAkademik.equalsIgnoreCase("tidak")) {
            System.out.print("berapakah nilai Daspro anda : ");
            int nilaiDaspro = input.nextInt();
            
            System.out.print("Apakah Anda memiliki serifikat kopetensi pemprograman (punya/tidak) : ");
            String serifikat = input.next();

            if (nilaiDaspro >= nilaiMinDaspro || serifikat.equalsIgnoreCase("punya")) {
                System.out.print("Berapa nilai wawancara anda : ");
                int nilaiWawancara = input.nextInt();

                if (nilaiWawancara >= nilaiMinWawancara) {
                    System.out.println("Selamat anda lulus seleksi menjadi asisten praktikum");
                } else {
                    System.out.println("Mohon maaf anda tidak lolos karena nilai wawancara anda kurang memnuhi syarat");
                }
            } else {
                System.out.println("Mohon maaf anda tidak lolos karena nilai daspro anda kurang memenuhi syarat dan anda tidak memiliki sertifikat");
            }
            
        } else {
            System.out.println("Maaf anda tidak lolos seleksi karena anda harus berstatus aktif dan tidak terkena sanksi akademik");
        }
        
        input.close();
    }
}