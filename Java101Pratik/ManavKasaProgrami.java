package Java101Pratik;

import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double pearPrice=2.14, applePrice=3.67, tomatoPrice=1.11, bananaPrice=0.95, eggplantPrice=5;
        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        pearKg = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        appleKg = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        tomatoKg = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        bananaKg = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        eggplantKg = input.nextDouble();

        double totalPrice = pearPrice * pearKg + applePrice * appleKg +tomatoPrice * tomatoKg
                +bananaPrice * bananaKg+ eggplantPrice * eggplantKg;
        System.out.println("Toplam Tutar : " + totalPrice);
    }
}
