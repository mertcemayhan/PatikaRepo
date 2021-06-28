package Java101Pratik;

import java.util.Scanner;

public class MaxandMinFinder {
    public static void main(String[] args) {
        int count, max = -99999, min = 99999, value;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            value = input.nextInt();
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
