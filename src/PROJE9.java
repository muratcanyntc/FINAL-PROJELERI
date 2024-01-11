import java.util.Scanner;
public class PROJE9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı girin: ");
        int sayi = scanner.nextInt();
        System.out.print("Hedef sayı sistemi (2, 8, 16): ");
        int hedefSayiSistemi = scanner.nextInt();
        String cevrilmisSayi = "";
        if (hedefSayiSistemi == 2) {
            cevrilmisSayi = Integer.toBinaryString(sayi);
        } else if (hedefSayiSistemi == 8) {
            cevrilmisSayi = Integer.toOctalString(sayi);
        } else if (hedefSayiSistemi == 16) {
            cevrilmisSayi = Integer.toHexString(sayi);
        } else {
            System.out.println("Geçersiz hedef sayı sistemi!");
            return;
        }
        System.out.println("Çevrilmiş sayı: " + cevrilmisSayi);
    }
}