import java.util.Scanner;
public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Yarıçap Bilgisi Al
        System.out.print("Daire yaricapini giriniz: ");
        double yaricap = input.nextDouble();

        // Pi sayısı tanımlama
        float pi = 3.14159f;

        // Matematiksel işlemler
        System.out.println("SONUÇLARI GÖSTER");
        System.out.println("---------------------");

        // Daire Alanı
        double alan = pi * Math.pow(yaricap, 2);
        System.out.printf("Daire Alani: %.2f cm^2\n", alan);

        // Daire Çevresi
        double cevre = 2 * pi * yaricap;
        System.out.printf("Daire Cevresi: %.2f cm%n", cevre);

        // Daire Çapı
        double cap = 2 * yaricap;
        System.out.printf("Daire Capi: %.2f cm\n", cap);

        // Küre Hacmi
        double kure_hacmi = (4.0 / 3.0) * pi * Math.pow(yaricap, 3);
        System.out.printf("Kure Hacmi: %.2f cm^3\n", kure_hacmi);

        // Küre Yüzey Alanı
        double kure_yuzey_alani = 4 * pi * Math.pow(yaricap, 2);
        System.out.printf("Kure Yuzey Alani: %.2f cm^2\n", kure_yuzey_alani);

        input.close();
    }
}
