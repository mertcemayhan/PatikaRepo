package Java101Pratik;

import java.util.Scanner;

public class GCDandLCMCalculator {
    public static void main(String[] args) {
        int n1, n2;
        int largeNumber, smallNumber, gcd = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        if (n1 > n2) {
            largeNumber = n1;
            smallNumber = n2;
        } else {
            largeNumber = n2;
            smallNumber = n1;
        }

        int i = smallNumber;
        while (i > 0) {
            if (smallNumber % i == 0 && largeNumber % i == 0) {
                gcd = i;
                break;
            }
            i--;
        }
        System.out.println(gcd);

        int k = 1;
        while (n1 * n2 > 0) {
            if (k % n1 == 0 && k % n2 == 0) {
                System.out.println(k);
                break;
            }
            k++;
        }
    }
}
