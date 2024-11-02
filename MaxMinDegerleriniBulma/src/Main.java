import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***** En Büyük/En Küçük Sayıları Bulma Programı *****");
        System.out.print("Kaç sayı gireceğinizi girin: ");
        int a=input.nextInt();
        int max=0,min=0,sayi;

        for (int i = 1; i <= a; i++)
        {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi= input.nextInt();
            if (i == 1)
            {
                max = sayi;
                min = sayi;
            }
            if (sayi > max)
            {
                max = sayi;
            }
            if (sayi < min)
            {
                min = sayi;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçün sayı: " + min);

    }
}
//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.