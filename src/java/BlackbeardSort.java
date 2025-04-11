import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BlackbeardSort {


    public static void blackBeardSort(int[] list) {
        int[] array = Arrays.copyOf(list, list.length);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, array.length);
        System.out.println("BlackBeard Sort: " + array[randomNumber]);
    }
}
