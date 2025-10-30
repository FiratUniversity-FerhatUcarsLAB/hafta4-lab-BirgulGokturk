public class ParaBozma {
    public static void main(String[] args) {
        int miktar = 670;
        int kalan = miktar;

        int yuzluk = kalan / 100;
        kalan %= 100;

        int ellilik = kalan / 50;
        kalan %= 50;

        int yirmilik = kalan / 20;
        kalan %= 20;

        int onluk = kalan / 10;
        kalan %= 10;

        int beslik = kalan / 5;
        kalan %= 5;

        int ikilik = kalan / 2;
        kalan %= 2;

        int birlik = kalan;

        System.out.println(miktar + " TL = " +
                yuzluk + " x 100, " +
                ellilik + " x 50, " +
                yirmilik + " x 20, " +
                onluk + " x 10, " +
                beslik + " x 5, " +
                ikilik + " x 2, " +
                birlik + " x 1");
    }
}