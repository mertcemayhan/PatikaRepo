package Java101Pratik;

import java.util.Scanner;
public class CalculateBodyMassIndex {
    public static void main(String[] args){
        double height, weight;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = input.nextDouble();

        double bmi = weight / (height*height);
        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }
}
