import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int i,t=0,sayi,onceki=1,fib,temp=0;
        Scanner input=new Scanner(System.in);

        System.out.print("Sayi Giriniz");
        sayi=input.nextInt();
        for(i=0;i<sayi;i++){
            if(i<2) {
                System.out.print(i+"-");

            }
             else {
                fib=onceki+temp;
                System.out.print(fib+"-");
                temp=onceki;
                onceki=fib;
            }
        }

    }
}
