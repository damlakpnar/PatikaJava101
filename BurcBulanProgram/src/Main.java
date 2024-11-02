import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ay,gün;
        System.out.println("***** BURÇ PROGRAMI *****");
        System.out.print("Doğduğunuz ayı giriniz: ");
        ay = input.nextInt();
        System.out.print("Gününüzü giriniz: ");
        gün= input.nextInt();

        if(ay==3 && gün>=21 || ay==4 && gün<=20){
            System.out.println("Koç Burcu");
        }
        else if(ay==4 && gün>=21 || ay==5 && gün<=21){
            System.out.println("Boğa Burcu");
        }
        else if(ay==5 && gün>=22 || ay==6 && gün<=22){
            System.out.println("İkizler Burcu");
        }
        else if(ay==6 && gün>=23 || ay==7 && gün<=22){
            System.out.println("Yengeç Burcu");
        }
        else if(ay==7 && gün>=23 || ay==8 && gün<=22){
            System.out.println("Aslan Burcu");
        }
        else if(ay==8 && gün>=23 || ay==9 && gün<=22){
            System.out.println("Başak Burcu");
        }
        else if(ay==9 && gün>=23 || ay==10 && gün<=22){
            System.out.println("Terazi Burcu");
        }
        else if(ay==10 && gün>=23 || ay==11 && gün<=21){
            System.out.println("Akrep Burcu");
        }
        else if(ay==11 && gün>=22 || ay==12 && gün<=21){
            System.out.println("Yay Burcu");
        }
        else if(ay==12 && gün>=22 || ay==1 && gün<=21){
            System.out.println("Oğlak Burcu");
        }
        else if(ay==1 && gün>=22 || ay==2 && gün<=19){
            System.out.println("Kova Burcu");
        }
        else{
            System.out.println("Balık Burcu");
        }

    }
}
/*
- Burç Bulan Program

Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
 switch-case kullanmadan yapınız.
 */