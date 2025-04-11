import java.util.Arrays;
import java.util.Random;

public class BogoSort {
    public static void bogoSort(int[] list) {
        int[] array = Arrays.copyOf(list, list.length);
        Random rnd = new Random();
        int tries = 0;
        while (!isSorted(array)) {
            tries++;
            shuffleArray(array, rnd);
        }

        System.out.println("Bogo Sort: " + Arrays.toString(array));
    }

    private static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void shuffleArray(int[] ar, Random rnd) {
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp = ar[index];
            ar[index] = ar[i];
            ar[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        long startTime = System.nanoTime();

        bogoSort(arr);

        // Record the end time
        long endTime = System.nanoTime();

        // Calculate the elapsed time in seconds
        long elapsedTime = endTime - startTime;
        double elapsedTimeInSeconds = elapsedTime / 1_000_000_000.0;

        // Output results
        System.out.println("Time taken: " + elapsedTimeInSeconds + " seconds");
    }
}
