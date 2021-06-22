package Java101Pratik;

import java.util.Scanner;

public class TotalofNumbersDividableby2and4 {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            n = input.nextInt();
            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 != 1);
        System.out.print("Toplam: " + total);

    }
}
