package Java101Pratik;

public class IsPalindrome {
    static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        int temp = number;

        while (temp != 0) {
            int remainder = temp % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            temp /= 10;
        }

        return number == reverseNumber;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(985));
    }
}
