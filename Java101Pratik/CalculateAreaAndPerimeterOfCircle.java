package Java101Pratik;

import java.util.Scanner;
public class CalculateAreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        int r, alpha;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();
        System.out.print("Dairenin merkez açı ölçüsünü giriniz:");
        alpha =  input.nextInt();

        double area = (3.14 * (r*r) * alpha)/360;
        System.out.println("Daire diliminin alanı: " + area);
    }
}
