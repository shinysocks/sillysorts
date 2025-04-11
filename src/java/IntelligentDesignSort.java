import java.util.Arrays;

public class IntelligentDesignSort {
    public static void intelligentDesignSort(int[] list){
        int[] array = Arrays.copyOf(list, list.length);
        if (!isSorted(array,0)){
            System.out.println("Intelligent Design Sort: Couldn't sort list");
        }else {
            System.out.println("Intelligent Design Sort: " + Arrays.toString(array));
        }
    }

    public static boolean isSorted(int[] array, int index) {
        if (index == array.length - 1) {
            return true;
        }
        if (array[index] > array[index + 1]) {
            return false;
        }
        return isSorted(array, index + 1);
    }
}
