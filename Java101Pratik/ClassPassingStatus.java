package Java101Pratik;

import java.util.Scanner;

public class ClassPassingStatus {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik, lectureCount = 5;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        int total = mat + fizik + kimya + turkce + muzik;

        if (!(mat >= 0 && mat <= 100)) {
            total -= mat;
            lectureCount -= 1;
        }
        if (!(fizik >= 0 && fizik <= 100)) {
            total -= fizik;
            lectureCount -= 1;
        }
        if (!(kimya >= 0 && kimya <= 100)) {
            total -= kimya;
            lectureCount -= 1;
        }
        if (!(turkce >= 0 && turkce <= 100)) {
            total -= turkce;
            lectureCount -= 1;
        }
        if (!(muzik >= 0 && muzik <= 100)) {
            total -= muzik;
            lectureCount -= 1;
        }

        double average = total / lectureCount;
        if (average <= 55) {
            System.out.println("Sınıfta kaldınız");
        } else {
            System.out.println("Tberikler, sınıfı geçtiniz!");
        }

        System.out.println("Ortalamanız: " + average);
    }
}
