import java.util.Scanner;
public class Main {

    static int asal(int sayi,int i){
        if(sayi==i){
            return 1;
        }
        else {
            if(sayi%i==0){
                return 0;
            }
            return asal(sayi,i+1);
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = input.nextInt();

        int i=2; //Bölme işlemini 2 ile başlatıyoruz
        if(asal(sayi,i)==1){
            System.out.println(sayi+" Sayısı Asaldır!");
        }
        else {
            System.out.println(sayi+" Sayısı Asal Değildir!");
        }

    }
}
/* Asal Sayı Bulan Program

Java dilinde "Recursive" metot kullanarak,
kullanıcıdan alınan sayının "Asal" sayı
olup olmadığını bulan programı yazın.

 */