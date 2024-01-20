import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class PROJE14 {
    public static void main(String[] args) {
        LocalDate tarih1 = LocalDate.of(2022, 1, 5);
        LocalDate tarih2 = LocalDate.of(2024, 12, 31);
        long gunFarki = ChronoUnit.DAYS.between(tarih1, tarih2);
        System.out.println("Tarih farkı (gün): " + gunFarki);
    }
}