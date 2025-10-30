/*
 * Ad Soyad: Birgül Göktürk
 * Ogrenci No:250541094
 * Tarih:27.10.2025
 * Aciklama: Gorev 3 - Maaş Hesaplama Sistemi
 * Bu sistem, bir çalışanın maaşını otomatik olarak hesaplayıp detaylı maaş bordrosu oluşturan basit bir programdır.
   Girilen brüt maaş ve mesai bilgilerine göre toplam gelir, yasal kesintiler ve net maaş hesaplanır.
   Sonuçta çalışan, kazanç ve kesintilerini şeffaf biçimde görebileceği düzenli bir bordro çıktısı elde eder.
 * 
import java.util.Scanner;
public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sabit oranlar
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        System.out.println("=== MAAS HESAPLAMA SISTEMI ===\n");

        System.out.print("Çalışan adı soyadı: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylık brüt maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Mesai saati sayısı: ");
        int mesaiSaat = input.nextInt();

        // Hesaplamalar
        double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgkKesinti = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesinti + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        // İstatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176;
        double gunlukNetKazanc = netMaas / 22;

        // Bordro
        System.out.println("\n====================================");
        System.out.println("         MAAS BORDROSU");
        System.out.println("====================================");
        System.out.println("Calisan: " + adSoyad);

        System.out.println("\nGELIRLER:");
        System.out.printf("  Brut Maas              : %8.2f TL\n", brutMaas);
        System.out.printf("  Mesai Ucreti (%d saat) : %8.2f TL\n", mesaiSaat, mesaiUcreti);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM GELIR           : %8.2f TL\n", toplamGelir);

        System.out.println("\nKESINTILER:");
        System.out.printf("  SGK Kesintisi (14.0%%)  : %8.2f TL\n", sgkKesinti);
        System.out.printf("  Gelir Vergisi (15.0%%)  : %8.2f TL\n", gelirVergisi);
        System.out.printf("  Damga Vergisi (0.8%%)   : %8.2f TL\n", damgaVergisi);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM KESINTI         : %8.2f TL\n", toplamKesinti);

        System.out.printf("\nNET MAAS                 : %.2f TL\n", netMaas);

        System.out.println("\nISTATISTIKLER:");
        System.out.printf("  Kesinti Orani          : %.1f\n", kesintiOrani);
        System.out.printf("  Saatlik Net Kazanc     : %.2f TL/saat\n", saatlikNetKazanc);
        System.out.printf("  Gunluk Net Kazanc      : %.2f TL/gun\n", gunlukNetKazanc);
        System.out.println("====================================");

        input.close();
    }
}

