import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int n = input.nextInt();
        double toplam = 0;
        for(int i=1;i<=n;i++){
            toplam+=(1.0/i);
        }
        System.out.println("Toplam: " + toplam);





    }
}
//Java ile girilen sayının harmonik serisini bulan program yazacağız.
// //Harmonik Sayı Serisi: 1 + 1/2 + 1/3 + 1/4 + .... + 1/n