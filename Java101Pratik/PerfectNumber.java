package Java101Pratik;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        int total = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }
        if (n == total) {
            System.out.println(n + " Mükemmel sayıdır");
        } else {
            System.out.println(n + " Mükemmel sayı değildir");
        }


    }
}
