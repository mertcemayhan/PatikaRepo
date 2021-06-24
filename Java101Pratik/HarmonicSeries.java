package Java101Pratik;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        int n;
        double total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            total += 1.0 / i;
        }
        System.out.println("Harmonik serinin sonucu: " + total);
    }
}
