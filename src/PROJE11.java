import java.util.Scanner;
import java.util.Random;

public class PROJE11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxHak = 3;
        int kullaniciSkor = 0;
        int bilgisayarSkor = 0;

        while (kullaniciSkor < maxHak && bilgisayarSkor < maxHak) {
            System.out.print("Taş, kağıt veya makas seçin (1: Taş, 2: Kağıt, 3: Makas): ");
            int kullaniciSecim = scanner.nextInt();

            int bilgisayarSecim = random.nextInt(3) + 1;

            if (kullaniciSecim == bilgisayarSecim) {
                System.out.println("Berabere! Her ikisi de aynı seçimi yaptı.");
            } else if ((kullaniciSecim == 1 && bilgisayarSecim == 3) ||
                    (kullaniciSecim == 2 && bilgisayarSecim == 1) ||
                    (kullaniciSecim == 3 && bilgisayarSecim == 2)) {
                System.out.println("Kullanıcı kazandı!");
                kullaniciSkor++;
            } else {
                System.out.println("Bilgisayar kazandı!");
                bilgisayarSkor++;
            }

            System.out.println("Kullanıcı Skoru: " + kullaniciSkor);
            System.out.println("Bilgisayar Skoru: " + bilgisayarSkor);
            System.out.println("-------------------------");
        }

        if (kullaniciSkor == maxHak) {
            System.out.println("Kullanıcı oyunu kazandı!");
        } else {
            System.out.println("Bilgisayar oyunu kazandı!");
        }
    }
}