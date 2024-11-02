import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("**************************");
        System.out.println(" Çin Zodyağı Hesaplama ");
        System.out.println("**************************");

        int yil;
        System.out.print("Doğum yılınızı giriniz: ");
        yil=input.nextInt();

        switch(yil%12){
            case 0:
                System.out.println("Zodyak Burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Zodyak Burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Zodyak Burcunuz. Köpek");
                break;
            case 3:
                System.out.println("Zodyak Burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Zodyak Burcunuz: Fare");
                break;
            case 5:
                System.out.println("Zodyak Burcunuz: Öküz");
                break;
            case 6:
                System.out.println("Zodyak Burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Zodyak Burcunuz: Tavşan");
                break;
            case 8:
                System.out.println("Zodyak Burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Zodyak Burcunuz: Yılan");
                break;
            case 10:
                System.out.println("Zodyak Burcunuz: At");
                break;
            case 11:
                System.out.println("Zodyak Burcunuz: Koyun");
                break;
            default:
                System.out.print("Hatalı girdiniz !!");
                break;
        }

    }
}
/*
Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun
 */