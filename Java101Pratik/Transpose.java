package Java101Pratik;

import java.util.Scanner;
import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Matrisin satır sayısını giriniz: ");
        int n = scan.nextInt();
        System.out.print("Matrisin kolon sayısını giriniz: ");
        int k = scan.nextInt();
        int[][] matrix = new int[n][k];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Matris : ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        int[][] transpose = new int[k][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpoze : ");
        for (int i = 0; i < transpose.length; i++) {
            System.out.println(Arrays.toString(transpose[i]));
        }
    }
}
