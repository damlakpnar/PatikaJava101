import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Sınır sayısını giriniz: ");
        sayi = input.nextInt();

        System.out.println("4'ün Kuvvetleri: ");
        for(int i=1;i<=sayi;i*=4){
            System.out.println(i);
        }
        System.out.println("*******************");
        System.out.println("5'in Kuvvetleri: ");
        for(int j=1;j<=sayi;j*=5){
            System.out.println(j);
        }


    }
}
/*
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */