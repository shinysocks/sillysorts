import java.util.Arrays;
import java.util.Random;

public class FlipSort {

    public static void flipSort(int[] list){
        while(!isSorted(list)){
            shuffle(list);
        }
        System.out.println("flip Sort: " + Arrays.toString(list));
    }


    private static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static final Random random = new Random();
    private  static void shuffle(int[] array){
        if (array.length < 2) return;

        int index1 = random.nextInt(array.length);
        int index2;

        do {
            index2 = random.nextInt(array.length);
        } while (index1 == index2);

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }


    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        long startTime = System.nanoTime();

        flipSort(arr);


        long endTime = System.nanoTime();


        long elapsedTime = endTime - startTime;
        double elapsedTimeInSeconds = elapsedTime / 1_000_000_000.0;

        System.out.println("Time taken: " + elapsedTimeInSeconds + " seconds");
    }


}
