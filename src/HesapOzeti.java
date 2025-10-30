public class HesapOzeti {
    public static void main(String[] args) {
        // Ürün verileri
        String urun1 = "Kahve";
        int miktar1 = 1;
        double fiyat1 = 45.0;

        String urun2 = "Çikolata";
        int miktar2 = 3;
        double fiyat2 = 18.5;

        String urun3 = "Defter";
        int miktar3 = 2;
        double fiyat3 = 12.0;

        String urun4 = "Kalem";
        int miktar4 = 5;
        double fiyat4 = 4.75;

        // Toplam hesaplama
        double toplam = miktar1 * fiyat1 +
                miktar2 * fiyat2 +
                miktar3 * fiyat3 +
                miktar4 * fiyat4;

        // Tablo başlığı
        System.out.println("╔════════════════════════════════════╗");
        System.out.printf("║ %-10s │ %-8s │ %-8s   ║\n", "Ürün", "Miktar", "Fiyat");
        System.out.println("╠════════════════════════════════════╣");

        // Satırlar (for kullanılmadan)
        System.out.printf("║ %-10s │ %-8d │ %-8.2f   ║\n", urun1, miktar1, fiyat1);
        System.out.printf("║ %-10s │ %-8d │ %-8.2f   ║\n", urun2, miktar2, fiyat2);
        System.out.printf("║ %-10s │ %-8d │ %-8.2f   ║\n", urun3, miktar3, fiyat3);
        System.out.printf("║ %-10s │ %-8d │ %-8.2f   ║\n", urun4, miktar4, fiyat4);

        // Alt çizgi ve toplam
        System.out.println("╠════════════════════════════════════╣");
        System.out.printf("║ %-21s │ %-8.2f   ║\n", "Toplam Tutar", toplam);
        System.out.println("╚════════════════════════════════════╝");
    }
}