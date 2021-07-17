package Java101Pratik;

public class HarmonicAverage {
    static void harmonicAverage (int[] arr){
        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            sum += 1.0 / arr[i];
        }

        double harmonicAvg = arr.length / sum;
        System.out.println("Harmonik ortalama: " + harmonicAvg);
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};
        harmonicAverage(list);

    }
}
