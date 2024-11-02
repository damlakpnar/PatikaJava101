import java.util.Scanner;
public class Main {
    static int fib(int n){
        if(n==1 || n==2){
            return 1;
        }

        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci serisi elaman sayısı: ");
        int sayi=sc.nextInt();

        System.out.println(fib(sayi));

    }
}
//Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.