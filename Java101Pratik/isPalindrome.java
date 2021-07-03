package Java101Pratik;

import java.util.Scanner;

public class isPalindrome {
    static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Palindrom olup olmadığı kontrol edilecek sayıyı giriniz: ");
        number = input.nextInt();
        int temp = number;

        while (temp != 0) {
            int remainder = temp % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            temp /= 10;
        }

        return number == reverseNumber;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
}
