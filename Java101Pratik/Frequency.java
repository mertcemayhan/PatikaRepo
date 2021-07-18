package Java101Pratik;

import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(list));
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            int count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                }
            }

            if (i < list.length - 1) {
                int checker = list[i + 1];
                if (list[i] != checker) {
                    System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
                }
                if (list[list.length - 1] == list[i]) {
                    System.out.println(list[list.length - 1] + " sayısı " + count + " kere tekrar edildi.");
                    break;
                }
            }
        }
    }
}
