import java.util.Scanner;
public class PROJE8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisi için bir sayı girin: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci serisi:");
        int fib1 = 0, fib2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(fib1 + " ");
            int sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
        }
    }
}