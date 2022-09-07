import java.util.Scanner;
public class ObebEkok {
    public static void main(String[] args) {
        int ebob, ekok, sayi1, sayi2,temp, i = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz :");
        sayi1 = input.nextInt();

        System.out.print("2.sayıyı giriniz :");
        sayi2 = input.nextInt();
        ebob = 1;
        if (sayi1 > sayi2) {
            temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        while (i <= sayi1) {
            if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
                ebob = i;
            }
            i++;
        }
        ekok=(sayi1*sayi2)/ebob;

        System.out.println("EBOB("+sayi1+","+sayi2+")="+ebob);
        System.out.println("EKOK("+sayi1+","+sayi2+")="+ekok);
    }
}
