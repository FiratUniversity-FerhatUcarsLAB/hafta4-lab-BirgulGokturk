import java.util.Scanner;

public class OgrenciBilgi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bilgileri alma
        System.out.println("--- Öğrenci Bilgi Girişi ---");

        System.out.print("Ad: ");
        String ad = input.nextLine();

        System.out.print("Soyad: ");
        String soyad = input.nextLine();

        System.out.print("Öğrenci Numarası: ");
        int ogrenciNumarasi = input.nextInt();

        System.out.print("Yaş: ");
        int yas = input.nextInt();

        System.out.print("GPA - Not Ortalaması (0.00 - 4.00): ");
        double gpa = input.nextDouble();


        // Bilgileri düzenli biçimde yazdırma
        System.out.println("\n--- Öğrenci Bilgileri ---");
        System.out.printf("\nAd: " +  ad);
        System.out.printf("\nSoyad: " + soyad);
        System.out.printf("\nÖğrenci No: " + ogrenciNumarasi);
        System.out.printf("\nYaş: " + yas);
        System.out.printf("\nGPA: %.2f%n", gpa);

        input.close();
    }
}