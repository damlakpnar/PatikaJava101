import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 1;
        int toplam = n1 + n2;
        System.out.print("Fibonacci sayı adetini giriniz:  ");
        int adet = input.nextInt();

        System.out.print(n1 + " " + n2+" ");
        while (adet > 0)
        {
            System.out.print(toplam + " ");
            adet--;
            n1 = n2;
            n2 = toplam;
            toplam= n1 + n2;
        }

    }
}
/*
Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:
9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
 */