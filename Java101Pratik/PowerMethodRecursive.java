package Java101Pratik;
import java.util.Scanner;
public class PowerMethodRecursive {
    static int power(int base, int n) {
        if (n == 0){
            return 1;
        }
        return base * power(base,n-1);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = input.nextInt();
        System.out.print("Üs değerini giriniz :");
        int n = input.nextInt();

        System.out.println(power(base, n));
    }
}
