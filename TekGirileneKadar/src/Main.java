import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean tek;
        int toplam=0,sayi;

        do {
            System.out.println("Sayı Giriniz: ");
            sayi=input.nextInt();
            if(sayi%2==0 && sayi%4==0) {
                toplam+=sayi;
            }

            tek=sayi%2==1;
        }while (!tek);

        System.out.println("Toplam: "+toplam);
    }
}
/*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
 ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */