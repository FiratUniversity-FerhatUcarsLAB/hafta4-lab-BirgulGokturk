public class MilKilometreTablosu {
    public static void main(String[] args) {
        // Başlık
        System.out.printf("%-5s %-10s%n", "Mil", "Kilometre");
        System.out.println("-------------------");

        // Dönüşüm oranı
        double oran = 1.609;

        // Her satırı ayrı ayrı yazdır
        int mil1 = 1;
        System.out.printf("%-5d %-10.3f%n", mil1, mil1 * oran);

        int mil2 = 5;
        System.out.printf("%-5d %-10.3f%n", mil2, mil2 * oran);

        int mil3 = 10;
        System.out.printf("%-5d %-10.3f%n", mil3, mil3 * oran);

        int mil4 = 20;
        System.out.printf("%-5d %-10.3f%n", mil4, mil4 * oran);

        int mil5 = 50;
        System.out.printf("%-5d %-10.3f%n", mil5, mil5 * oran);
    }
}