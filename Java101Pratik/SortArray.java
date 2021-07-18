package Java101Pratik;

import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int arrSize = scan.nextInt();
        int[] arr = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1) + ". Elemanı : ");
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }
}
