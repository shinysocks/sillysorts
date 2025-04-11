import java.util.Arrays;

public class Driver {
    static long startTime;
    static long endTime;
    static long elapsedTime;
    static double elapsedTimeInSeconds;

    public static void main(String[] args) {
        int[] list = {1,4,2,3,5,7,6,8};
        System.out.println("Array: " + Arrays.toString(list) +"\n");

        int[] temp1 = Arrays.copyOf(list, list.length);
        startTime = System.nanoTime();
        FlipSort.flipSort(temp1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        elapsedTimeInSeconds = elapsedTime / 1_000_000_000.0;
        System.out.println("Time taken: " + elapsedTimeInSeconds + " seconds \n");

        int[] temp0 = Arrays.copyOf(list, list.length);
        startTime = System.nanoTime();
        BogoSort.bogoSort(temp0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        elapsedTimeInSeconds = elapsedTime / 1_000_000_000.0;
        System.out.println("Time taken: " + elapsedTimeInSeconds + " seconds \n");

        int[] temp2 = Arrays.copyOf(list, list.length);
        startTime = System.nanoTime();
        temp2 = BogobogoSort.bogoBogoSort(temp2);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        elapsedTimeInSeconds = elapsedTime / 1_000_000_000.0;
        System.out.println("BogoBogo Sort: " + Arrays.toString(temp2));
        System.out.println("Time taken: " + elapsedTimeInSeconds + " seconds\n");

        int[] temp3 = Arrays.copyOf(list, list.length);
        startTime = System.nanoTime();
        RoBogoSort.roBogoSort(temp2);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        elapsedTimeInSeconds = elapsedTime / 1_000_000_000.0;
        System.out.println("BogoBogo Sort: " + Arrays.toString(temp2));
        System.out.println("Time taken: " + elapsedTimeInSeconds + " seconds\n");

        startTime = System.nanoTime();
        StalinSort.stalinSort(list);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        elapsedTimeInSeconds = elapsedTime / 1_000_000_000.0;
        System.out.println("Time taken: " + elapsedTimeInSeconds + " seconds \n");

        startTime = System.nanoTime();
        BlackbeardSort.blackBeardSort(list);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        elapsedTimeInSeconds = elapsedTime / 1_000_000_000.0;
        System.out.println("Time taken: " + elapsedTimeInSeconds + " seconds \n");

        startTime = System.nanoTime();
        IntelligentDesignSort.intelligentDesignSort(list);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        elapsedTimeInSeconds = elapsedTime / 1_000_000_000.0;
        System.out.println("Time taken: " + elapsedTimeInSeconds + " seconds \n");
    }
}
