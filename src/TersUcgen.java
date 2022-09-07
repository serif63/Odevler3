import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Kaç Bamaklı Üçgen Oluşturmak İsityorsunuz:");
        int basmak=input.nextInt();

        for(int i=1;i<=basmak;i++) {
            System.out.println();
            for (int k = 1; k < i; k++)
                System.out.print(" ");
            for(int t=2*(basmak-i)-1;t>0;t--)
                System.out.print("*");
        }
    }
}
