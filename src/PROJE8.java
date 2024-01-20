public class PROJE8 {
    public static void main(String[] args) {
        int n = 20; // İlk 20 Fibonacci sayısını elde etmek için n'i 20 olarak ayarlayın

        // Fibonacci dizisini tutmak için bir dizi oluşturun
        int[] fibonacci = new int[n];

        // İlk iki sayıyı elle atayın
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Fibonacci dizisini hesaplayın
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        // Fibonacci dizisini ekrana yazdırın
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}