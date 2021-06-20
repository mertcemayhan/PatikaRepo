package Java101Pratik;

import java.util.Scanner;

public class ChinaZodiacCalculator {
    public static void main(String[] args) {
        int birthYear;
        String chinaZodiac = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        birthYear = input.nextInt();

        switch (birthYear % 12) {
            case 0:
                chinaZodiac = "Maymun";
                break;
            case 1:
                chinaZodiac = "Horoz";
                break;
            case 2:
                chinaZodiac = "Köpek";
                break;
            case 3:
                chinaZodiac = "Domuz";
                break;
            case 4:
                chinaZodiac = "Fare";
                break;
            case 5:
                chinaZodiac = "Öküz";
                break;
            case 6:
                chinaZodiac = "Kaplan";
                break;
            case 7:
                chinaZodiac = "Tavşan";
                break;
            case 8:
                chinaZodiac = "Ejderha";
                break;
            case 9:
                chinaZodiac = "Yılan";
                break;
            case 10:
                chinaZodiac = "At";
                break;
            case 11:
                chinaZodiac = "Koyun";
                break;
        }

        System.out.println("Çin zodyağı burcunuz: " + chinaZodiac);
    }
}
