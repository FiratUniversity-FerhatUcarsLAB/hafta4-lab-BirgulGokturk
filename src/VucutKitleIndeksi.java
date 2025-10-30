public class VucutKitleIndeksi {
    public static void main(String[] args) {
        // Kilo (kg) ve boy (metre) değerleri
        double kilo = 53.0;
        double boy = 1.60;

        // BMI hesaplama
        double bmi = kilo / (boy * boy);

        // Sonucu yazdır
        System.out.printf("Vücut Kitle İndeksiniz: %.2f%n", bmi);
    }
}