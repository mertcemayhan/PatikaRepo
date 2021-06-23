package Java101Pratik;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        int n, r;
        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        r = input.nextInt();

        int nFac = 1;
        int rFac = 1;
        int nMinusRFac = 1;

        for (int i = 1; i <= n; i++) {
            nFac *= i;
        }
        for (int j = 1; j <= r; j++) {
            rFac *= j;
        }
        for (int k = 1; k <= (n - r); k++) {
            nMinusRFac *= k;
        }

        int combination = nFac / (rFac * nMinusRFac);
        System.out.println(n + "'in " + r + "'li kombinasyonu: " + combination);

    }
}
