import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        String userName, password;
        int sec=0, right =3,bakiye,miktar;
        bakiye=3000;
        Scanner input = new Scanner(System.in);
        while (right != 0 || sec==4) {
            System.out.print("Kullanınıc Adınızı Giriniz :");
            userName = input.nextLine();

            System.out.print("Şifrenizi Giriniz :");
            password = input.nextLine();

            if (userName.equals("serif") && password.equals("aydın63")) {
               while (sec!=4) {
                   System.out.println("Merhaba Bankamıza Hpşgeldiniz");
                   System.out.println("1-Para Çekme\n2-Para Yatırma\n3-Bakiye Sorma\n4-Çıkış");

                   System.out.print("Seçiminizi Giriniz :");
                   sec = input.nextInt();
                   switch (sec) {

                       case 1:
                           System.out.println("Bakiyeniz :" + bakiye);
                           System.out.println("Çekmek İstediğiniz Miktarı Giriniz:");
                           miktar = input.nextInt();
                           if (miktar <= bakiye) {
                               bakiye -= miktar;
                               System.out.println("Kalan Bakiyeniz:" + bakiye);
                           } else System.out.println("Geçersiz Miktar Girdiniz");
                           break;

                       case 2:
                           System.out.println("Bakiyeniz :" + bakiye);
                           System.out.println("Yatırmak İstediğiniz Miktarı Giriniz:");
                           miktar = input.nextInt();
                           if (miktar >=0) {
                               bakiye += miktar;
                               System.out.println("Kalan Bakiyeniz:" + bakiye);
                           } else System.out.println("Geçersiz Miktar Girdiniz");
                           break;

                       case 3:
                           System.out.println("Kalan Bakiyeniz: "+ bakiye);
                           break;

                       case 4:
                           System.out.println("İyi Günler");
                           break;
                   }
               }

            } else {
                System.out.println("Kullanıcı adınızı veya şifrenizi yanlış girdiniz");
            }
                right--;
                if(sec==4)
                    break;
            if (right == 0) {
                System.out.print("Hesabınız Bloke Olmuştur.");
                break;
            }
        }
    }
}
