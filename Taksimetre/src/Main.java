import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km,acilisUcret=10;
        double kmBasi=2.20,toplam;
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km=input.nextInt();

        toplam=acilisUcret+(km*kmBasi);
        if(toplam<20)
        {
            System.out.print("Ödenecek Ücret: 20 TL");
        }//min ödenecek tutar 20 TL olacak.
        else {
            System.out.print("Ödenecek Ücret: "+toplam);
        }

    }
}