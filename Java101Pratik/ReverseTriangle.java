package Java101Pratik;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı : ");
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            for (int k = n - 1; k >= n - i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; 2 * (n - i) - 1 >= j; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
