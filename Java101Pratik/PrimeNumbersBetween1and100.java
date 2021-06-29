package Java101Pratik;

public class PrimeNumbersBetween1and100 {
    public static void main(String[] args) {
        boolean isPrime;

        for (int i = 2; i <= 100; i++) {
            isPrime = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
