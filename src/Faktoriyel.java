public class Faktoriyel {
    public static void main(String[] args) {
        // Sayılar
        int a = 5;
        int b = 4;
        int c = 3;
        int d = 2;
        int e = 1;

        // Ara adımları yazdır
        System.out.print("5! = ");
        System.out.print(a + " × ");
        System.out.print(b + " × ");
        System.out.print(c + " × ");
        System.out.print(d + " × ");
        System.out.print(e);

        // Hesapla
        int sonuc = a * b * c * d * e;

        // Sonucu yazdır
        System.out.println(" = " + sonuc);
    }
}