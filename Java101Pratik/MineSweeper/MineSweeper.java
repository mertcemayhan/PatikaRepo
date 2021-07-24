package Java101Pratik.MineSweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    int mineCount;
    String[][] field;
    String[][] userField;
    int userRow;
    int userCol;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mineCount = (rowNumber * colNumber) / 4;
        this.field = new String[rowNumber][colNumber];
        this.userField = new String[rowNumber][colNumber];
    }

    boolean isExploded() {
        try {
            if (this.field[userRow][userCol] == "*")
                return true;
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("Geçersiz koordinat !");
            return false;
        }
    }

    void firstStep() {
        for (int i = 0; i < this.field.length; i++) {
            Arrays.fill(this.field[i], "-");
        }
        userField = new String[field.length][];
        for (int i = 0; i < field.length; i++) {
            userField[i] = new String[field[i].length];
            for (int j = 0; j < field[i].length; j++)
                userField[i][j] = field[i][j];
        }
    }

    void secondStep() {
        for (int i = 0; i < this.mineCount; i++) {
            int x = rand.nextInt(this.rowNumber);
            int y = rand.nextInt(this.colNumber);
            if (!this.field[x][y].equals("*")) {
                this.field[x][y] = "*";
            } else {
                --i;
            }
        }
    }

    void openBoard() {
        for (String[] row : this.field) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    void board() {
        for (String[] row : this.userField) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    boolean isWin() {
        for (String[] row : this.field) {
            for (String col : row) {
                if (col.equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    void run() {
        firstStep();
        secondStep();
        System.out.println("Mayınların Konumu");
        openBoard();

        while (!isExploded()) {
            int counter = 0;
            System.out.println("===========================");
            System.out.print("Satır Giriniz : ");
            userRow = scan.nextInt();
            System.out.print("Sütun Giriniz : ");
            userCol = scan.nextInt();

            try {
                if (field[userRow][userCol].equals("-")) {
                    if (field[userRow + 1][userCol].equals("*")) counter++;
                }
            } catch (ArrayIndexOutOfBoundsException ignored) { }

            try {
                if (field[userRow][userCol].equals("-")) {
                    if (field[userRow - 1][userCol].equals("*")) counter++;
                }
            } catch (ArrayIndexOutOfBoundsException ignored) { }

            try {
                if (field[userRow][userCol].equals("-")) {
                    if (field[userRow][userCol + 1].equals("*")) counter++;
                }
            } catch (ArrayIndexOutOfBoundsException ignored) { }

            try {
                if (field[userRow][userCol].equals("-")) {
                    if (field[userRow][userCol - 1].equals("*")) counter++;
                }
            } catch (ArrayIndexOutOfBoundsException ignored) { }

            try {
                if (field[userRow][userCol].equals("-")) {
                    if (field[userRow + 1][userCol + 1].equals("*")) counter++;
                }
            } catch (ArrayIndexOutOfBoundsException ignored) { }

            try {
                if (field[userRow][userCol].equals("-")) {
                    if (field[userRow - 1][userCol - 1].equals("*")) counter++;
                }
            } catch (ArrayIndexOutOfBoundsException ignored) { }

            try {
                if (field[userRow][userCol].equals("-")) {
                    if (field[userRow + 1][userCol - 1].equals("*")) counter++;
                }
            } catch (ArrayIndexOutOfBoundsException ignored) { }

            try {
                if (field[userRow][userCol].equals("-")) {
                    if (field[userRow - 1][userCol + 1].equals("*")) counter++;
                }
            } catch (ArrayIndexOutOfBoundsException ignored) { }

            try {
                if (field[userRow][userCol].equals("-")) {
                    userField[userRow][userCol] = String.valueOf(counter);
                    field[userRow][userCol] = String.valueOf(counter);
                }
                if (field[userRow][userCol].equals("*")) {
                    System.out.println("Game Over!!");
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException ignored) {
                System.out.println("Geçersiz koordinat !");
            }

            board();
            if (isWin()) {
                System.out.println("Oyunu Kazandınız !");
                break;
            }
        }
        openBoard();
    }
}
