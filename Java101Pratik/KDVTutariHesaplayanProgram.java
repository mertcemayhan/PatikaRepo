package Java101Pratik;

import java.util.Scanner;
public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        double tutar, kdvliTutar, kdvTutari;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutar giriniz: ");
        tutar = input.nextDouble();
        kdvTutari = (tutar >= 0 && tutar <= 1000) ? tutar*0.18 : tutar*0.08;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("KDVsiz Tutar: " + tutar);
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDVli Tutar: " + kdvliTutar);
    }
}
