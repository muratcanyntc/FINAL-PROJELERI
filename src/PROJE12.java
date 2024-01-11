import java.util.Arrays;

public class PROJE12 {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5};
        int kaydirmaMiktari = 2;

        System.out.println("Önce: " + Arrays.toString(dizi));

        kaydir(dizi, kaydirmaMiktari);

        System.out.println("Sonra: " + Arrays.toString(dizi));
    }

    public static void kaydir(int[] dizi, int kaydirmaMiktari) {
        int uzunluk = dizi.length;

        // Kaydırma miktarını dizinin boyutuna mod alarak sınırlıyoruz
        kaydirmaMiktari = kaydirmaMiktari % uzunluk;

        // Diziyi sağa doğru kaydırma
        for (int i = 0; i < kaydirmaMiktari; i++) {
            int temp = dizi[uzunluk - 1];

            for (int j = uzunluk - 1; j > 0; j--) {
                dizi[j] = dizi[j - 1];
            }

            dizi[0] = temp;
        }
    }
}