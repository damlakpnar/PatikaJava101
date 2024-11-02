import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam=0;
        int j=0;
        double ortalama=0;
        System.out.print("Sayı Giriniz: ");
        sayi = input.nextInt();
        System.out.println("3 ve 4 ile bölünen sayılar: ");
        for(int i=0;i<sayi;i++){
            if(i%3==0 && i%4==0){
                System.out.println(i);
                toplam+=i;
                j++;
            }
        }
        ortalama=toplam/j;
        System.out.println("Sayıların ortalaması: "+ortalama);
    }
}
/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen
sayıların ortalamasını hesaplayan programı yazınız.
 */