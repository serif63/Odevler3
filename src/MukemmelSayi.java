import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        sayi=input.nextInt();
        for(int i=1;i<sayi;i++)
        {
            if(sayi%i==0)
                toplam+=i;
        }
        if(toplam==sayi)
            System.out.println(sayi+" Mükemmel Sayıdır.");
        else System.out.println(sayi+" Mükemmel Sayıdır Değildir");

    }
}
