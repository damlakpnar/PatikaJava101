import java.util.Scanner;
public class Main {
    static boolean isPalindrom (int number) {
        int temp = number,reverseNumber=0,lastNumber;
        while (temp!=0) {
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp=temp/10;
        }
        if (number == reverseNumber)
        {
            System.out.println("Palindrom Sayıdır.");
        }
        else
        {
            System.out.println("Palindorm sayı değil.");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();
        System.out.println("***************************");
        isPalindrom(num);

    }
}