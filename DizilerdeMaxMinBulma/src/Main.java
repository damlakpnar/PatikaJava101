import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println(Arrays.toString(list));
        int sayi;
        System.out.print("Bir sayı giriniz: ");
        sayi = sc.nextInt();

        int min=list[0];
        int max=list[0];

        for(int j=0;j<list.length;j++){
            if(list[j]<min){
                min=list[j];
            }
            if(list[j]>max){
                max=list[j];
            }
        }

        for(int j=0;j<list.length;j++){
            if(list[j]> sayi){
                if(list[j]<=max){
                    max=list[j];
                }
            }
            if(list[j]<sayi){
                if(list[j]>=min){
                    min=list[j];
                }
            }

        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+max);

    }
}