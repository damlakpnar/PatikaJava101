import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi,sifre,sifre2,yeniSifre;
        int secim;

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        kullaniciAdi = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        sifre = input.nextLine();

        System.out.println("\n***** ŞİFRE DOĞRULAMA *****\n ");
        System.out.print("Şifrenizi Giriniz: ");
        sifre2 = input.nextLine();

        if(sifre2==sifre){
            System.out.println("Şifre Doğrulandı !! ");
        }
        else{
            System.out.println("Yanlış Şifre Girildi !!");
            System.out.print("Şifrenizi mi unuttunuz?\n1-Yeni şifre oluştur\n2-Sistemden çıkış\n");
            secim=input.nextInt();

            switch(secim){
                case 1:
                    System.out.println("Oluşturmak istediğiniz şifreyi yazınız: ");
                    yeniSifre = input.nextLine();

                    if(yeniSifre==sifre)
                    {
                        System.out.println("Şifre Oluşturulamadı !!\n");
                    }
                    else {
                        System.out.println("Şifre Oluşturuldu ");
                    }
                    break;

                case 2:
                    System.out.println("Çıkış Yapılıyor ...");
                    break;

                default:
                    break;


            }
        }

    }

}
/*
- Kullanıcı Girişi
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz.
" sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */