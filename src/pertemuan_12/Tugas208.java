package pertemuan_12;
import java.util.Scanner;

public class Tugas208 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== KAFE KAMPUS ===");
        System.out.println("Daftar Menu yang Tersedia:");
        System.out.println("----------------------------------------");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-15s : Rp %d\n", (i + 1), menu[i], harga[i]);
        }
        System.out.println("----------------------------------------\n");

        
        System.out.print("Cari menu yang ingin dicek: ");
        String cariMenu = input.nextLine();
        
        int indeksCari = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                indeksCari = i;
                break;
            }
        }

        if (indeksCari != -1) {
            System.out.println("[DITEMUKAN] Menu '" + menu[indeksCari] + "' tersedia dengan harga Rp " + harga[indeksCari] + ".\n");
        } else {
            System.out.println("[TIDAK TERSEDIA] Mohon maaf, menu '" + cariMenu + "' tidak tersedia di daftar.\n");
        }

        System.out.print("Masukkan jumlah jenis item yang ingin dipesan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine();

        String[] pesananNama = new String[jumlahPesanan];
        int[] pesananJumlah = new int[jumlahPesanan];
        int[] pesananSubtotal = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            boolean menuValid = false;
            String namaPilihan = "";

            while (!menuValid) {
                System.out.print("Masukkan nama menu: ");
                namaPilihan = input.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPilihan)) {
                        menuValid = true;
                        namaPilihan = menu[j];
                        break;
                    }
                }

                if (!menuValid) {
                    System.out.println("[GAGAL] Menu tidak valid atau tidak tersedia. Silakan masukkan ulang.");
                }
            }

            System.out.print("Masukkan jumlah porsi/item untuk " + namaPilihan + ": ");
            int jmlPorsi = input.nextInt();
            input.nextLine();

            int hargaSatuan = 0;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(namaPilihan)) {
                    hargaSatuan = harga[j];
                    break;
                }
            }

            pesananNama[i] = namaPilihan;
            pesananJumlah[i] = jmlPorsi;
            pesananSubtotal[i] = hargaSatuan * jmlPorsi;

            totalBiaya += pesananSubtotal[i];
        }

        System.out.println("\n========================================");
        System.out.println("          STRUK PEMESANAN KAFE          ");
        System.out.println("========================================");
        System.out.printf("%-18s | %-6s | %s\n", "Menu", "Jumlah", "Subtotal");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-18s | %-6d | Rp %d\n", pesananNama[i], pesananJumlah[i], pesananSubtotal[i]);
        }
        
        System.out.println("----------------------------------------");
        System.out.printf("TOTAL BIAYA KESELURUHAN : Rp %d\n", totalBiaya);
        System.out.println("========================================");
        System.out.println("   Terima kasih telah memesan di Kafe!  ");
        
        input.close();
    }
}