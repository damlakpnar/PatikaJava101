import java.util.Scanner;
public class TersUcgenOlusturma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");
        int n = input.nextInt();

        for(int i=n; i>0; i--) {
            for(int j=i; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
/*
Basamak Sayısı : 10

 *******************
 *****************
 ***************
 *************
 ***********
 *********
 *******
 *****
 ***
 *

 */