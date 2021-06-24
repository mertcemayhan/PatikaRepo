package Java101Pratik;

import java.util.Scanner;

public class TotalofDigits {
    public static void main(String[] args) {
        int n, digit;
        int total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        while (n != 0) {
            digit = n % 10;
            total += digit;
            n /= 10;
        }
        System.out.println("Girdiğiniz sayının rakamları toplamı: " + total);
    }
}
