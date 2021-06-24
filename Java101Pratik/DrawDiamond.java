package Java101Pratik;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = n - 1; j >= (n - i); j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
