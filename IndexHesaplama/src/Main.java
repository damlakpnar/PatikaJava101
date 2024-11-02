import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,index;
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy=input.nextDouble();
        System.out.print("Kilounuzu kilogram cinsinden giriniz: ");
        kilo=input.nextDouble();

        index=kilo/(boy*boy);
        System.out.println("Vücut Kütle İndeksiniz: "+index);

    }
}
///*
//Vücut Kitle İndeksi Hesaplama
//Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
//Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
// */