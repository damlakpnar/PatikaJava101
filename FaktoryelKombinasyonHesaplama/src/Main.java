import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("***** FAKTÖRYEL HESAPLAMA *****");
        System.out.print("Faktöryeli hesaplanıcak sayıyı giriniz: ");
        int sayi = input.nextInt();
        int faktoryel=1;
        int i,j,m;

        int n,r;
        int facN = 1, facR = 1, facM = 1, toplam = 1;
        for (i = sayi; i >= 1; i--) {
            faktoryel *= i;
        }
        System.out.println(sayi+" Faktöryeli: "+faktoryel);
        System.out.println("****************************************");
        System.out.println("***** KOMBİNASYON HESAPLAMA *****");
        System.out.print("n değerini giriniz: ");
        n=input.nextInt();
        System.out.print("r değerini giriniz: ");
        r=input.nextInt();
        for (i = n; i >= 1; i--) {
            facN *= i;
        }
        for (j = r; j >= 1; j--) {
            facR *= j;
        }
        for (m = (n - r); m >= 1; m--) {
            facM *= m;
        }

        toplam = facN / (facR * facM);
        System.out.println("Kombinasyon: " + toplam);


    }
}
/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
 N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
Java ile kombinasyon hesaplayan program yazınız.
 */