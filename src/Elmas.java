import java.util.Scanner;
public class Elmas {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 6 - i; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= i+2; k++) {
                System.out.print(" ");
            }
            for (int k = 9; k >= 2 * i+1 ; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}