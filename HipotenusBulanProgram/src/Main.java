import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        double c;

        System.out.print("Üçgenin 1.kenarını girin: ");
        a=input.nextInt();

        System.out.print("Üçgenin 2.kenarını girin: ");
        b=input.nextInt();

        c=Math.sqrt(a*a+b*b);
        System.out.print("Hipotenüs: "+c);
    }
}