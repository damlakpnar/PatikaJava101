import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik,fizik,kimya,turkce,tarih,muzik;
        System.out.println("Matematik notunuzu giriniz: ");
        matematik=input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik=input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya=input.nextInt();

        System.out.println("Turkce notunuzu giriniz: ");
        turkce=input.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih=input.nextInt();

        System.out.println("Muzik notunuzu giriniz: ");
        muzik=input.nextInt();

        double ortalama=(matematik+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.println("Ortalamanız: " + ortalama);

        if(ortalama>=60){
            System.out.println("Sınıfı gectiniz ");
        }
        else {
            System.out.println("Sınıfı gecemediniz ! ");
        }


    }
}