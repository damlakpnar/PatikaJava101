import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=input.nextInt();

        int toplam=0;
        for(int i=1;i< sayi;i++){
            if(sayi%i==0){
                toplam+=i;
            }

        }
        if (toplam == sayi)
        {
            System.out.println(sayi + " Bir mükemmel sayıdır!");
        }
        else
        {
            System.out.println(sayi + " Bir mükemmel sayı değildir!");
        }

    }
}
/*
Mükemmel Sayı Bulan Program
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan
ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan
programı Java dilinde yazınız.
 */