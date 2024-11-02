import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int matematik,fizik,turkce,kimya,muzik;
        double ortalama;
        int matematikNotu=0,fizikNotu=0,turkceNotu=0,kimyaNotu=0,muzikNotu=0;

        System.out.print("Matemaik Notunuzu Giriniz: ");
        matematik=input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik=input.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce=input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya=input.nextInt();
        System.out.print("Muzik Notunuzu Giriniz: ");
        muzik=input.nextInt();

        if(matematik>=0 && matematik<=100) {
            matematikNotu=matematik;
        }
        if(fizik>=0 && fizik<=100) {
            fizikNotu=fizik;
        }
        if(turkce>=0 && turkce<=100) {
            turkceNotu=turkce;
        }
        if(kimya>=0 && kimya<=100) {
            kimyaNotu=kimya;
        }
        if (muzik>=0 && muzik<=100) {
            muzikNotu=muzik;
        }

        ortalama=(matematikNotu+fizikNotu+turkceNotu+kimyaNotu+muzikNotu)/5;

        System.out.println("Ortalamanız: "+ortalama);

        if(ortalama<55) {
            System.out.println("Dersten Kaldınız !!");
        }
        else {
            System.out.println("Dersi Geçtiniz !!");
        }


    }
}
/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */