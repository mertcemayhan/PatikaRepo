package Java101Pratik;

import java.util.Scanner;
public class UcKenariBilinenUcgeninAlanHesaplamasi {
    public static void main(String[] args) {
        double a, b, c, u, alanKare, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenarın uzunluğunu giriniz: ");
        a= input.nextDouble();
        System.out.print("İkinci kenarın uzunluğunu giriniz: ");
        b= input.nextDouble();
        System.out.print("Üçüncü kenarın uzunluğunu giriniz: ");
        c= input.nextDouble();

        u = (a+b+c)/2;
        alanKare = u * (u-a) * (u-b) * (u-c);
        alan = Math.sqrt(alanKare);
        System.out.println("Üçgenin alanı " + alan + "'dır");
    }
}
