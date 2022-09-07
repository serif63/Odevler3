import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
     int i=1;
     double n,hortalama=0;
        Scanner input=new Scanner(System.in);
        System.out.println("harmonik ortlama sayısını giriniz :");
        n=input.nextDouble();

        for(i=1;i<=n;i++) {

            hortalama+=(1.0/i);
        }
        System.out.println("Harmonik Ortalama="+hortalama);
    }
}
