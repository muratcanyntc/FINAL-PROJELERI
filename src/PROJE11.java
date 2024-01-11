import java.util.Scanner;

public class PROJE11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taş, kağıt, makas oyununa hoş geldiniz!");
        System.out.println("1 - Taş");
        System.out.println("2 - Kağıt");
        System.out.println("3 - Makas");
        System.out.print("Seçiminizi yapın (1-3): ");
        int userChoice = input.nextInt();
        int computerChoice = (int) (Math.random() * 3) + 1;
        String userChoiceString = "";
        String computerChoiceString = "";
        switch (userChoice) {
            case 1:
                userChoiceString = "Taş";
                break;
            case 2:
                userChoiceString = "Kağıt";
                break;
            case 3:
                userChoiceString = "Makas";
                break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız!");
                System.exit(0);
        }
        switch (computerChoice) {
            case 1:
                computerChoiceString = "Taş";
                break;
            case 2:
                computerChoiceString = "Kağıt";
                break;
            case 3:
                computerChoiceString = "Makas";
                break;
        }
        System.out.println("Siz: " + userChoiceString);
        System.out.println("Bilgisayar: " + computerChoiceString);
        if (userChoice == computerChoice) {
            System.out.println("Berabere!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            System.out.println("Tebrikler, kazandınız!");
        } else {
            System.out.println("Maalesef, kaybettiniz!");
        }
        input.close();
    }
}