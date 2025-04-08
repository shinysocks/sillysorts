package FunnySorts;

import java.util.Arrays;


public class StalinSort {


    public static void stalinSort(int[] list) {
        int[] result = new int[list.length];
        int index = 0;
        result[index++] = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] >= result[index - 1]) {
                result[index++] = list[i];
            }
        }
        System.out.println("Stalin Sort: " + Arrays.toString(result));
    }
}
