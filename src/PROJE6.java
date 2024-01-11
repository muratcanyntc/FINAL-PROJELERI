import java.util.Scanner;
public class PROJE6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? ");
        int sayiAdedi = scanner.nextInt();
        int[] sayilar = new int[sayiAdedi];
        for (int i = 0; i < sayiAdedi; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayilar[i] = scanner.nextInt();
        }
        int enBuyukSayi = sayilar[0];
        int enBuyukSayiIndex = 0;
        for (int i = 1; i < sayiAdedi; i++) {
            if (sayilar[i] > enBuyukSayi) {
                enBuyukSayi = sayilar[i];
                enBuyukSayiIndex = i;
            }
        }
        System.out.println("En büyük sayı: " + enBuyukSayi);
        System.out.println("Bu sayı " + (enBuyukSayiIndex + 1) + ". sırada.");
    }
}