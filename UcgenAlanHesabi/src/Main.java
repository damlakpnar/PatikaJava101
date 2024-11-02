import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a,b,c;
        System.out.print("Üçgenin 1.kenarını giriniz: ");
        a=input.nextFloat();

        System.out.print("Üçgenin 2.kenarını giriniz: ");
        b=input.nextFloat();

        System.out.print("Üçgenin 3.kenarını giriniz: ");
        c=input.nextFloat();

        double u=(a+b+c)/2;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        double cevre=2*u;

        System.out.println("Üçgenin Çevresi: "+cevre);
        System.out.print("Üçgenin Alanı: "+alan);



    }
}