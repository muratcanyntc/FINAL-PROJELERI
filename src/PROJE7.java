import java.util.Scanner;
public class PROJE7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        double oran = sayi1 / sayi2;
        System.out.println("Oran: " + oran);
    }
}
