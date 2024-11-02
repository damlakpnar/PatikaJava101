import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvOrani;
        System.out.print("KDV'siz Fiyatı Giriniz: ");
        tutar = input.nextDouble();

        if (tutar < 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        double kdvTutar = tutar * kdvOrani;
        double toplam = tutar + kdvTutar;
        System.out.println("KDV'li Fiyat: " + toplam);
        System.out.println("KDV Fiyatı: " + kdvTutar);


    }
}