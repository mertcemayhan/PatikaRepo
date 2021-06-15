package Java101Pratik;

import java.util.Scanner;
public class TaximeterCalculator {
    public static void main(String[] args){
        double km, unitPrice = 2.2;
        int initialPrice = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen km'yi giriniz: ");
        km= input.nextDouble();

        double calculatedPrice= initialPrice + km * unitPrice;
        double billPrice= calculatedPrice<20 ? 20 : calculatedPrice;
        System.out.println("Ödenecek tutar: " + billPrice);

    }
}
