import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.print("Birinci sayıyı giriniz (a): ");
        a = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz (b): ");
        b = input.nextDouble();
        System.out.print("Üçüncü sayıyı giriniz (c): ");
        c = input.nextDouble();
        System.out.println("\n***** GİRİLEN SAYILARIN BÜYÜKTEN KÜÇÜĞE SIRALANIŞI *****\n");

        if(a>b && a>c){
            if(b>c){
                System.out.println("a>b>c");
            }
            else{
                System.out.println("a>c>b");
            }
        }
        else if(b>a && b>c){
            if(a>c){
                System.out.println("b>a>c");
            }
            else{
                System.out.println("b>c>a");
            }
        }
        else{
            if(a>b){
                System.out.println("c>a>b");
            }
            else{
                System.out.println("c>b>a");
            }
        }

    }
}
//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.