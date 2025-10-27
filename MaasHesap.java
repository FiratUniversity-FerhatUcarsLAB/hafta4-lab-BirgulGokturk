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
public class MaasHesaplama {
    public static void main(String[] args) {

        // Sabit oranlar
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        Scanner input = new Scanner(System.in);

        // Bilgiler alınır
        System.out.print("Calisan adi soyadi: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylik brut maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Mesai saati sayisi: ");
        int mesaiSaati = input.nextInt();

        // 1. Gelirler
        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        // 2. Kesintiler
        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        // 3. Net Maaş
        double netMaas = toplamGelir - toplamKesinti;

        // BORDRO
        System.out.println("====================================================");
        System.out.println("                      MAAS BORDROSU                 ");
        System.out.println("====================================================");
        System.out.println("Calisan: " + adSoyad);
        System.out.println();
        System.out.println("GELIRLER:");
        System.out.printf("Brut Maas                : %.2f TL\n", brutMaas);
        System.out.printf("Mesai Ucreti (%d saat)      : %.2f TL\n", mesaiSaati, mesaiUcreti);
        System.out.println("--------------------------------------------");
        System.out.printf("TOPLAM GELIR             : %.2f TL\n", toplamGelir);
        System.out.println();
        System.out.println("KESINTILER:");
        System.out.printf("SGK Kesintisi (14.0%%)    : %.2f TL\n", sgk);
        System.out.printf("Gelir Vergisi (15.0%%)    : %.2f TL\n", gelirVergisi);
        System.out.printf("Damga Vergisi (0.8%%)     : %.2f TL\n", damgaVergisi);
        System.out.println("--------------------------------------------");
        System.out.printf("TOPLAM KESINTI           : %.2f TL\n", toplamKesinti);
        System.out.printf("NET MAAS                 : %.2f TL\n", netMaas);
        System.out.println("====================================================");

        input.close();
    }
}
