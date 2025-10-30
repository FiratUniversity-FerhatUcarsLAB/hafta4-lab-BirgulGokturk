public class AlisverisListesi {
    public static void main(String[] args) {
        // Başlıkları yazdır
        System.out.printf("%-15s %-10s %-10s%n", "Ürün", "Miktar", "Fiyat");

        // Ayraç çizgisi
        System.out.println("----------------------------------------");

        // Ürünleri yazdır
        System.out.printf("%-15s %-10d %-10.2f%n", "Elma", 2, 15.50);
        System.out.printf("%-15s %-10d %-10.2f%n", "Ekmek", 1, 5.25);
        System.out.printf("%-15s %-10d %-10.2f%n", "Süt", 3, 12.90);
        System.out.printf("%-15s %-10d %-10.2f%n", "Yumurta", 1, 22.00);
    }
}