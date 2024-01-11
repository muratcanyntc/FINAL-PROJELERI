import java.util.Scanner;
public class PROJE13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgenin ilk kenarını girin: ");
        int kenar1 = scanner.nextInt();
        System.out.print("Üçgenin ikinci kenarını girin: ");
        int kenar2 = scanner.nextInt();
        System.out.print("Üçgenin üçüncü kenarını girin: ");
        int kenar3 = scanner.nextInt();
        if (kenar1 + kenar2 > kenar3 && kenar1 + kenar3 > kenar2 && kenar2 + kenar3 > kenar1) {
            System.out.println("Bu kenar uzunluklarıyla bir üçgen oluşturulabilir.");
        } else {
            System.out.println("Bu kenar uzunluklarıyla bir üçgen oluşturulamaz.");
        }
    }
}