import java.util.Scanner;
public class EnbuyukEnkucuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int adet, temp, temp2, enbuyuk=0, enkucuk=0, sayi1, sayi2;

        System.out.print("kaç Tane Sayı Gireceksiniz :");
        adet = input.nextInt();
        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ".Sayıyı Giriniz");
            sayi1 = input.nextInt();
            if(i==1) {
                enkucuk=sayi1;
                enbuyuk=sayi1;
            }

            if (sayi1 >= enbuyuk) {
                enbuyuk = sayi1;
            } else if (sayi1 <= enkucuk) {
                enkucuk = sayi1;

            }
        }
        System.out.println("En Büyük sayı:"+enbuyuk);
        System.out.print("En Büyük sayı:"+enkucuk);
    }
}
