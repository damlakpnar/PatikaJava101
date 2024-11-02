import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi=3.14;
        double aci,yaricap;
        double cevre,alan;

        System.out.print("Dairenin yarıçapını giriniz: ");
        yaricap = input.nextDouble();
        System.out.print("Merkez açıyı giriniz: ");
        aci = input.nextDouble();

        alan=pi*yaricap*yaricap*aci/360;
        cevre=2*pi*yaricap;

        System.out.println("Dairenin Çevresi: "+cevre);
        System.out.println("Dairenin Alanı: "+alan);

    }
}
// /*
//Dairenin Alanını ve Çevresini Hesaplayan Program
//Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını
//ve çevresini hesaplayan programı yazın.
//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//Alan Formülü : π * r * r;
//Çevre Formülü : 2 * π * r;
//
//𝜋 sayısını = 3.14 alınız.
//Formül : (𝜋 * (r*r) * 𝛼) / 360
//
// */