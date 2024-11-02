import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Sayı Giriniz: ");
        sayi = input.nextInt();

        int basamakSayi = 0;
        int tempSayi = sayi;
        int basamakDegeri;
        int toplam = 0;
        int usluHesap;

        // Basamak Sayısı Bulma İşlemi
        while(tempSayi != 0){
            tempSayi = tempSayi / 10;
            basamakSayi++;
        }
        System.out.println("Girilen Sayının Basamak Sayısı: " + basamakSayi);

        // Bir sayının son basamağını bulma ve Armstrong hesaplama
        tempSayi = sayi;
        while(tempSayi != 0){
            basamakDegeri = tempSayi % 10;

            usluHesap = 1;
            for(int i = 1; i <= basamakSayi; i++){
                usluHesap *= basamakDegeri;
            }
            toplam += usluHesap;

            tempSayi = tempSayi / 10;
        }
        if(toplam == sayi){
            System.out.println(sayi + " sayısı bir Armstrong sayıdır");
        }
        else{
            System.out.println(sayi + " sayısı bir Armstrong sayı değildir.");
        }
    }
}