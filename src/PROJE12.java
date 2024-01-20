public class PROJE12 {
    public static void main(String[] args) {
        String kelime = "Programlama";
        int kaydirmaMiktari = 10;
        String kaydirilmisKelime = kelimeKaydir(kelime, kaydirmaMiktari);
        System.out.println("Kaydırılmış kelime: " + kaydirilmisKelime);
    }
    public static String kelimeKaydir(String kelime, int kaydirmaMiktari) {
        int uzunluk = kelime.length();
        kaydirmaMiktari = kaydirmaMiktari % uzunluk;
        String kaydirilmisKelime = kelime.substring(uzunluk - kaydirmaMiktari) + kelime.substring(0, uzunluk - kaydirmaMiktari);

        return kaydirilmisKelime;
    }
}