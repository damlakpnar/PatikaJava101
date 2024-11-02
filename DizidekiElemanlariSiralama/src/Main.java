import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int value;

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1) + ".Elemanı: ");
            value = input.nextInt();
            arr[i] = value;
        }
        System.out.println("Dizi: " + Arrays.toString(arr));
        System.out.println("Sıralama: ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}