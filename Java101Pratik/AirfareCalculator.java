package Java101Pratik;

import java.util.Scanner;

public class AirfareCalculator {
    public static void main(String[] args) {
        int km, age, type;
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = input.nextInt();

        double normalPrice = 0.10 * km;

        if (type == 1 || type == 2) {
            if (age < 12) {
                normalPrice /= 2;
            } else if (age <= 24) {
                normalPrice *= 0.9;
            } else if (age > 65) {
                normalPrice *= 0.7;
            }
        } else {
            isError = true;
        }

        if (type == 2) {
            normalPrice *= 0.8;
        }

        if (isError) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else if (type == 1) {
            System.out.println("Toplam tutar = " + normalPrice + " TL");
        } else{
            double roundTripFare = normalPrice * 2;
            System.out.println("Toplam tutar = " + roundTripFare + " TL");
        }
    }
}
