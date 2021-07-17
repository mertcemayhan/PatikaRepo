package Java101Pratik;

public class TheClosestNumberLargerAndSmallerThanInput {
    static void closest(int[] arr, int inp) {
        int small = -99999999;
        int large = -99999999;

        for (int i : arr) {
            if (i < inp && Math.abs(inp - i) < Math.abs(inp - small)){
                small = i;
            }

            if (i > inp && Math.abs(i - inp) < Math.abs(large - inp)){
                large = i;
            }
        }
        System.out.println("Büyük en yakın: " + large);
        System.out.println("Küçük en yakın: " + small);
    }

    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        closest(list, -2);
    }
}
