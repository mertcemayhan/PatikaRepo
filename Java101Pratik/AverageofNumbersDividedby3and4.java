package Java101Pratik;

import java.util.Scanner;

public class AverageofNumbersDividedby3and4 {
    public static void main(String[] args) {
        int k, total = 0, count = 0; //toDealWithStartwith0
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k = input.nextInt();

        for (int i = 0; i < k; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i != 0) {
                total += i;
                count += 1;
            }
        }
        if (count != 0) {
            int average = total / count;
            System.out.println("Ortalama: " + average);
        } else {
            System.out.println("Girdiğiniz sayıya kadar olan sayılar arasında hem 3'e hem de 4'e bölüne" +
                    "bilen bir sayı yoktur");
        }


    }
}
