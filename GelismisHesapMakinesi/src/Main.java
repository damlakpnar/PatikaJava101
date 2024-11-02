import java.util.Scanner;
public class Main {
    // Toplama işlemi
    static void toplama(){
        int toplam=0,sayi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç sayı toplayacaksınız: ");
        int secim = sc.nextInt();
        for (int i = 1; i <= secim; i++) {
            System.out.print(i + ". Sayı: ");
            sayi = sc.nextInt();
            toplam += sayi;
        }
        System.out.println("Toplama İşleminin Sonucu: " + toplam);

    }
    static void cikarma(){
        int toplam = 0, sayi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int secim = sc.nextInt();
        for (int i = 1; i <= secim; i++) {
            System.out.print(i + ". Sayı: ");
            sayi = sc.nextInt();
            if (i == 1) {
                toplam += sayi;
                continue;
            }
            toplam -= sayi;
        }
        System.out.println("Çıkarma İşleminin Sonucu: " + toplam);

    }
    static void carpma(){
        int toplam = 1, sayi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int secim = sc.nextInt();
        for (int i = 1; i <= secim; i++) {
            System.out.print(i + ". Sayı: ");
            sayi = sc.nextInt();
            if (sayi == 0) {
                toplam = 0;
                break;
            }
            toplam *= sayi;
        }
        System.out.println("Çarpma İşleminin Sonucu: " + toplam);

    }
    static void bolme(){
        double toplam = 0.0, sayi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int secim = sc.nextInt();
        for (int i = 1; i <= secim; i++) {
            System.out.print(i + ". Sayı: ");
            sayi = sc.nextInt();
            if (i != 1 && sayi == 0) {
                System.out.println("Bölen için 0 değerini giremezsiniz !! ");
                continue;
            }
            if (i == 1) {
                toplam = sayi;
                continue;
            }
            toplam /= sayi;
        }
        System.out.println("Bölme İşleminin Sonucu: " + toplam);

    }
    static void usHesaplama(){
        int taban, us, toplam = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        taban = sc.nextInt();
        System.out.print("Üs değerini giriniz: ");
        us = sc.nextInt();
        for (int i = 1; i <= us; i++) {
            toplam *= taban;
        }
        System.out.println("Üslü İfadenin Sonucu: " + toplam);
    }
    static void faktoryel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Faktöriyel hesabı için sayı giriniz: ");
        int sayi = sc.nextInt();
        int toplam = 1;
        for (int i = 1; i <= sayi; i++) {
            toplam *= i;
        }
        System.out.println("Faktoryel İşleminin Sonucu: " + toplam);
    }
    static void mod(){
        int toplam;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hangi sayının modunu almak istiyorsunuz ?: ");
        int sayi = sc.nextInt();
        System.out.print("Hangi sayıya göre mod almak istiyorsunuz ?: ");
        int modSayi = sc.nextInt();
        if (sayi == 0 && modSayi == 0) {
            System.out.println("Lütfen geçerli değerler giriniz !! ");
        } else {
            toplam = sayi % modSayi;
            System.out.println("Mod Alma İşleminin Sonucu: " + toplam);
        }
    }
    static void dikdortgenHesaplama(){
        int uzunKenar, kısaKenar, cevre, alan;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        uzunKenar = sc.nextInt();
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        kısaKenar = sc.nextInt();

        cevre = (uzunKenar * 2) + (kısaKenar * 2);
        alan = uzunKenar * kısaKenar;
        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;
        String menu = "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n" +
                "6-Faktoriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap\n";

        do{
            System.out.print(menu);
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            secim = input.nextInt();
            switch (secim) {
                case 1:
                    toplama();
                    break;

                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usHesaplama();
                    break;
                case 6:
                    faktoryel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgenHesaplama();
                    break;
                default:
                    System.out.println("Lütfen geçerli bir değer giriniz!");
            }

        }while(secim!=0);
        System.out.println("Çıkış Yapılıyor ! ...");

    }
}