import java.util.Scanner;
public class AsalSayi {
    public static void main(String[] args) {
        int sayi;
        boolean asal = true;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz:");
        sayi = input.nextInt();
        for (int i = 2; i <= sayi; i++) {
            asal = true;
            for (int k = 2; k < i; k++) {
                if (i % k == 0)
                    asal = false;
            }
            if (asal == true)
                System.out.print(i+"-");


        }
    }
}
