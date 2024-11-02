import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("***** EBOB EKOK BULMA PROGRAMI *****");
        System.out.print("n1 sayısını giriniz: ");
        int n1=input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2=input.nextInt();

        int ebob=1,ekok=1;
        int x=1,y=1;

        if(n2>n1){
            while(x<=n1){
                if(n1%x==0 && n2%x==0){
                    ebob=x;
                }
                x++;
            }

            System.out.println("EBOB: "+ebob);
        }
        else {
            while(y<=n2){
                if(n1%y==0 && n2%y==0){
                    ebob=y;
                }
                y++;
            }
            System.out.println("EBOB: "+ebob);
        }

        ekok=(n1*n2)/ebob;
        System.out.println("EKOK: "+ekok);
    }

}
//Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
//EKOK = (n1*n2) / EBOB