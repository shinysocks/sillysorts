package FunnySorts;

import java.util.Arrays;
import java.util.Random;


public class RoBogoSort {
    private static final Random random = new Random();
    private static final int bound = 10;

    public static void roBogoSort(int[] list) {
        int[] sortedList = bogoSort(list);
        int[] tempList = new int[list.length];

        while(!Arrays.equals(tempList, sortedList)){
            for(int i=0; i<list.length;i++){
                int num = random.nextInt(bound);
                tempList[i] = num;
            }
        }
        System.out.println("Unnamed Sort: " + Arrays.toString(tempList));
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

        roBogoSort(arr);

        // Record the end time
        long endTime = System.nanoTime();

        // Calculate the elapsed time in seconds
        long elapsedTime = endTime - startTime;
        double elapsedTimeInSeconds = elapsedTime / 1_000_000_000.0;

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

    public static int[] bogoSort(int[] list) {
        int[] array = Arrays.copyOf(list, list.length);
        Random rnd = new Random();
        int tries = 0;
        while (!isSorted(array)) {
            tries++;
            shuffleArray(array, rnd);
        }

        return array;
    }
}
