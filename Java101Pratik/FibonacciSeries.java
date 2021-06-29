package Java101Pratik;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        n = input.nextInt();

        int begin = 0, second = 1;
        System.out.print(begin + " " + second + " ");
        for (int i = 1; i < n; i++) {
            int result = begin + second;
            begin = second;
            second = result;
            System.out.print(second + " ");
        }
    }
}
