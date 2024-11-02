import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password;
        int hak=3;
        int bakiye=1500;
        int secim;

        while(hak>0){
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if(userName.equals("patika")&& password.equals("kodluyoruz")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.print("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış\n");
                    System.out.print("Lütfen yapmak istedğiniz işlemi seçiniz: ");
                    secim = input.nextInt();

                    switch(secim){
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                            double miktar=input.nextInt();
                            bakiye+=miktar;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            double miktar2=input.nextInt();
                            if(bakiye<miktar2){
                                System.out.println("!! Yetersiz Bakiye !!");
                            }
                            else {
                                bakiye-=miktar2;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+bakiye);
                            break;

                    }


                }while(secim!=4);
                System.out.println("Tekrar görüşmek üzere.\nÇıkış Yapılıyor...");
                break;

            }
            else {
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre.Lütfen tekrar deneyiniz.");
                if(hak==0){
                    System.out.println("Hesabınız kısa süreliğine bloke olmuştur.Lütfen banka ile iletişime geçiniz");
                }
                else{
                    System.out.println("Kalan Hakkınız: "+hak);
                }

            }


        }


    }
}
//Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.