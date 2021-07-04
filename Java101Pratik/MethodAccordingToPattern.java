package Java101Pratik;

import java.util.Scanner;

public class MethodAccordingToPattern {
    static void pattern(int n) {
        if (n <= 0) {
            System.out.println("Çıktısı: " + n);
            return;
        }
        System.out.println("Çıktısı: " + n);
        pattern(n-5);
        System.out.println("Çıktısı: " + n);
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı: ");
        n = input.nextInt();

        pattern(n);
    }

}
