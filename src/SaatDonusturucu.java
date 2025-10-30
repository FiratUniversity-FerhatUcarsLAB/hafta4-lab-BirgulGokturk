public class SaatDonusturucu {
    public static void main(String[] args) {
        int toplamSaniye = 9567;

        // Saat, dakika ve saniye hesaplama
        int saat = toplamSaniye / 3600;
        int kalanSaniye = toplamSaniye % 3600;
        int dakika = kalanSaniye / 60;
        int saniye = kalanSaniye % 60;

        // Formatlı çıktı
        System.out.printf("%d:%02d:%02d%n", saat, dakika, saniye);
    }
}
