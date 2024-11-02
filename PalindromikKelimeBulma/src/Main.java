import java.util.Scanner;
public class Main {
    static String isPalindrom(String input) {
        String reverse ="";
        for(int i = input.length()-1 ; i >=0; i--){
            reverse += input.charAt(i);
        }
        if(input.equals(reverse)){
            return "Palindromik Kelime.";
        }
        else
            return "Palindromik Kelime değil ! ";


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kelime giriniz : ");
        String deger=sc.nextLine();

        System.out.println(isPalindrom(deger));

    }
}
/*
Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.
Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
Örnek : abba , asa , kavak, kayak
 */