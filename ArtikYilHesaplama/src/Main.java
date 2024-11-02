import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yil;
        System.out.print("Yıl Giriniz : ");
        yil=input.nextInt();

        if(yil%4==0){

            if(yil%100==0){

                if(yil%400==0){

                    System.out.print(yil + " bir artık yıldır.");
                }
                else
                {
                    System.out.print(yil + " bir artık yıl değildir.");
                }

            }
            else
            {
                System.out.print(yil+ " bir artık yıldır.");
            }

        }
        else
        {
            System.out.print(yil + " bir artık yıl değildir.");
        }

    }
}
/*
Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.
Artık Yıl Nedir?
Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl.
Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.
 */