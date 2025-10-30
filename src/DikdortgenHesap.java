public class DikdortgenHesap {
    public static void main(String[] args) {
        // Dikdörtgenin kenarları
        double en = 4.5;
        double boy = 7.9;

        // Alan ve çevre hesaplamaları
        double alan = en * boy;
        double cevre = 2 * (en + boy);

        // Sonuçları yazdır
        System.out.println("Dikdörtgenin Alanı: " + alan);
        System.out.println("Dikdörtgenin Çevresi: " + cevre);
    }
}