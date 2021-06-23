package Java101Pratik;

import java.util.Scanner;

public class Powerof4and5 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır değeri giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 4) {
                System.out.println(i);
        }
        for (int j = 1; j <= n; j *= 5) {
            System.out.println(j);
        }

    }
}
