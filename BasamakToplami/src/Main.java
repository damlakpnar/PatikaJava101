import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int sayi;
        int adet=0,toplam=0;

        System.out.print("Sayi giriniz: ");
        sayi=input.nextInt();

        while(sayi!=0){
            toplam+= (sayi%10);
            sayi/=10;
            adet++;

        }
        System.out.println("Basamak Sayılarının Toplamı: "+toplam);



    }
}
//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.