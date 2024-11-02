import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int taban,us;
        int hesap=1;
        System.out.println("***** Üslü Sayı Hesaplayan Program *****");
        System.out.print("Taban sayısını giriniz: ");
        taban=input.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        us=input.nextInt();

        for(int i=us;i>=1;i--){
            hesap*=taban;
        }
        System.out.println("Sonuç: "+hesap);

    }
}
/*
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */