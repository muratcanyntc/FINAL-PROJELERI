import java.util.Scanner;

public class PROJE7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi;
        int buyukToplam = 0;
        int kucukToplam = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Sayı girin: ");
            sayi = scanner.nextInt();

            if (sayi >= 50) {
                buyukToplam += sayi;
            } else {
                kucukToplam += sayi;
            }
        }

        double oran = (double) buyukToplam / kucukToplam;

        System.out.println("50 ve üstü olanların toplamı: " + buyukToplam);
        System.out.println("50'den küçük olanların toplamı: " + kucukToplam);
        System.out.println("Oran: " + oran);
    }
}