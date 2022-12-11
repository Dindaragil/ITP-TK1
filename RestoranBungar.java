import java.util.Scanner;
import java.text.DecimalFormat;
public class RestoranBungar {
    public static void main(String[] args) {

        // variabel dan tipe data
        int jumlahOrang, jumlahNasi, jumlahAyam, jumlahSteak, jumlahKwetiaw, jumlahKambing;
        double totalPembelian, diskon, hargaDiskon, diskonPerOrang, totalNasi, totalAyam, totalSteak, totalKwetiaw, totalKambing;
        String nama;
        String
        nasi = "1. Nasi Goreng Spesial",
        ayam = "2. Ayam Bakar Spesial",
        steak = "3. Steak Sirloin Spesial",
        kwetiaw = "4. Kwetiaw Siram Spesial",
        kambing = "5. Kambing Guling Spesial";

        double
                hargaNasi = 9999.99,
                hargaAyam = 12345.67,
                hargaSteak = 21108.40,
                hargaKwetiaw = 13579.13,
                hargaKambing = 98765.43;

        DecimalFormat x = new DecimalFormat("#.##");


        //input nama & jumlah orang
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("Selamat Datang di Restoran Bungar");
        System.out.printf("Pesan untuk berapa orang: ");
        jumlahOrang  = keyboard.nextInt();
        keyboard.nextLine();
        System.out.printf("Pesanan atas nama: ");
        nama  = keyboard.nextLine();
        System.out.println();

        //tampilan menu
        System.out.println("Menu Spesial hari ini");
        System.out.println("=====================");
        System.out.println(nasi + "              @ Rp. " + hargaNasi);
        System.out.println(ayam + "               @ Rp. " + hargaAyam);
        System.out.println(steak + "            @ Rp. " + hargaSteak);
        System.out.println(kwetiaw + "            @ Rp. " + hargaKwetiaw);
        System.out.println(kambing + "           @ Rp. " + hargaKambing);
        System.out.println();

        //input jumlah pesanan per menu
        System.out.println("Pesanan Anda [Batas Pesananan 0-10 Porsi");
        System.out.println(nasi + "     = ");
        jumlahNasi = keyboard.nextInt();
        System.out.println(ayam + "    = ");
        jumlahAyam = keyboard.nextInt();
        System.out.println(steak + "     = ");
        jumlahSteak = keyboard.nextInt();
        System.out.println(kwetiaw + "     = ");
        jumlahKwetiaw = keyboard.nextInt();
        System.out.println(kambing + "     = ");
        jumlahKambing = keyboard.nextInt();
        System.out.println();

        //perhitungan pembelian per menu
        totalNasi = jumlahNasi*hargaNasi;
        totalAyam=jumlahAyam*hargaAyam;
        totalSteak=jumlahSteak*hargaSteak;
        totalKwetiaw= jumlahKwetiaw*hargaKwetiaw;
        totalKambing=jumlahKambing*hargaKambing;

        //formating jumlah pembelian per menu
        String formatNasi = x.format(totalNasi);
        String formatAyam = x.format(totalAyam);
        String formatSteak = x.format(totalSteak);
        String formatKwetiaw = x.format(totalKwetiaw);
        String formatKambing = x.format(totalKambing);

        //perhitungan jumlah pembayaran dan diskon
        totalPembelian = totalNasi+totalAyam+totalSteak+totalKwetiaw+totalKambing;
        diskon = totalPembelian*0.10;
        hargaDiskon = totalPembelian - diskon;
        diskonPerOrang = hargaDiskon/jumlahOrang;

        //formating jumlah pembayaran dan diskon
        String formatTotalPembelian = x.format(totalPembelian);
        String formatDiskon = x.format(diskon);
        String formatHargaDiskon = x.format(hargaDiskon);
        String formatDiskonPerOrang = x.format(diskonPerOrang);
        
        //tampilan total pembelian per menu
        System.out.println("Selamat Menikmati Pesanan Anda....");
        System.out.println("Pembelian : ");
        
        System.out.println(nasi + "            "+ jumlahNasi + " Porsi" + " = Rp. " + hargaNasi + "  = Rp. "+ formatNasi);
        System.out.println(ayam + "             "+ jumlahAyam + " Porsi" + " = Rp. " + hargaAyam + " = Rp. " + formatAyam);
        System.out.println(steak + "          "+ jumlahSteak + " Porsi" + " = Rp. " + hargaSteak + "  = Rp. " + formatSteak);
        System.out.println(kwetiaw + "          "+ jumlahKwetiaw + " Porsi" + " = Rp. " + hargaKwetiaw + " = Rp. " + formatKwetiaw);
        System.out.println(kambing + "         "+ jumlahKambing + " Porsi" + " = Rp. " + hargaKambing + " = Rp. " + formatKambing);

        //tampilan total pembayaran dan diskon
        System.out.println("================================================================================");

        System.out.println("Total Pembelian                                          = Rp. " +  formatTotalPembelian );
        System.out.println();

        System.out.println("Disc. 10% (Masa Promosi)                                 = Rp. " +formatDiskon);
        System.out.println("================================================================================");

        System.out.println("Total Pembelian setelah disc 10%                         = Rp. " + formatHargaDiskon);
        System.out.println();

        System.out.println("Pembelian Per Orang (Untuk "+ jumlahOrang + " Orang)                      = Rp. " + formatDiskonPerOrang);
        System.out.println();

        System.out.println("Terimakasih atas kunjungan Anda....");
        System.out.println("...Tekan ENTER untuk Keluar...");

    }
}