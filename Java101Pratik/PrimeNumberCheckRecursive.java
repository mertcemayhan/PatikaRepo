package Java101Pratik;

import java.util.Scanner;

public class PrimeNumberCheckRecursive {
    static boolean primeNumber(int n, int counter) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % counter == 0) {
            return false;
        }
        if ( counter * counter > n) {
            return true;
        }

        return primeNumber(n, counter + 1);
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();

        if (primeNumber(number, 2)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }
    }
}

