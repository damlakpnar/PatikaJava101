import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;
        float sayi1,sayi2;

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        secim=input.nextInt();

        System.out.print("1.sayiyi giriniz: ");
        sayi1=input.nextFloat();
        System.out.print("2.sayiyi giriniz: ");
        sayi2=input.nextFloat();

        switch(secim){
            case 1:
                System.out.println("Toplama işleminin sonucu: "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma işleminin sonucu: "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpma işleminin sonucu: "+(sayi1*sayi2));
                break;
            case 4:
                if(sayi2==0){
                    System.out.println("Sayı sıfıra bölünemez !!");
                }
                else{
                    System.out.println("Bölme işleminin sonucu: "+(sayi1/sayi2));
                }
                break;
            default:
                System.out.println("Geçersiz Seçim !!");
                break;
        }

    }
}