import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.00;

        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        double armutFiyat,elmaFiyat,domatesFiyat,muzFiyat,patlicanFiyat;

        System.out.print("Armut kaç kilo? : ");
        armutKg=input.nextDouble();
        System.out.print("Elma kaç kilo? : ");
        elmaKg=input.nextDouble();
        System.out.print("Domates kaç kilo? : ");
        domatesKg=input.nextDouble();
        System.out.print("Muz kaç kilo? : ");
        muzKg=input.nextDouble();
        System.out.print("Patlican kaç kilo? : ");
        patlicanKg=input.nextDouble();

        armutFiyat=armut*armutKg;
        elmaFiyat=elma*elmaKg;;
        domatesFiyat=domates*domatesKg;
        muzFiyat=muz*muzKg;
        patlicanFiyat=patlican*patlicanKg;

        double toplamTutar=armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat;
        System.out.println("Toplam Tutar : "+toplamTutar);

    }
}
/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin
kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

 */