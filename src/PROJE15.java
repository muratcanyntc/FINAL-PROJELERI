import java.util.Scanner;

public class PROJE15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Denklemi girin: ");
        String denklem = scanner.nextLine();
        denklem = denklem.replaceAll("\\s+", "");
        int esittirIndex = denklem.indexOf("=");
        String solTaraf = denklem.substring(0, esittirIndex);
        String sagTaraf = denklem.substring(esittirIndex + 1);
        int x;
        if (solTaraf.contains("x")) {
            x = Integer.parseInt(sagTaraf);
        } else {
            x = Integer.parseInt(solTaraf);
        }
        System.out.println("x = " + x); // hocam bu projeyi doğru yapıp yapmadığımdan emin değilim kodlarda hata vermiyor ama denklem giricne hata veriyor ?
    }
}