import java.util.Arrays;
import java.util.Random;

public class BogobogoSort {
    private static final Random random = new Random();

    public static int[] bogoBogoSort(int[] list) {
        if (list.length <= 1) return list;

        while(!isSorted(list)) {
            int[] arr = Arrays.copyOf(list, list.length - 1);
            bogoBogoSort(arr);
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = list[list.length - 1];

            if (isSorted(arr)) {
                list = arr;
                return list;
            } else {
                shuffleArray(list, random);
            }
        }
        return null;
    }



    private static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        long startTime = System.nanoTime();

        int[] sortedArr = bogoBogoSort(arr);

        // Record the end time
        long endTime = System.nanoTime();

        // Calculate the elapsed time in seconds
        long elapsedTime = endTime - startTime;
        double elapsedTimeInSeconds = elapsedTime / 1_000_000_000.0;

        // Output results
        System.out.println("BogoBogo Sort: " + Arrays.toString(sortedArr));
        System.out.println("Time taken: " + elapsedTimeInSeconds + " seconds");
    }

    private static void shuffleArray(int[] list, Random rnd) {
        for (int i = list.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp = list[index];
            list[index] = list[i];
            list[i] = temp;
        }
    }
}
