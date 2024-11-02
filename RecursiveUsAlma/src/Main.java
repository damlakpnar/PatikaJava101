import java.util.Scanner;
public class Main {
    static double usHesaplama(int taban,int us){
        if(us<0)
            return 1/usHesaplama(taban,-us);

        if(us==0)
            return 1;

        return taban * usHesaplama(taban,--us);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs Değerini Giriniz: ");
        int us = input.nextInt();
        System.out.println("İşlemin Sonucu: "+usHesaplama(taban,us));
    }
}