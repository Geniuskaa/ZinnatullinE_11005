import java.util.Arrays;

public class FirstTask {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int base = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < base) {
                i++;
            }

            while (array[j] > base) {
                j--;
            }

            if (i <= j) {
                int store = array[i];
                array[i] = array[j];
                array[j] = store;
                i++;
                j--;
            }
        }


        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        int x[] = {1,3,7,2,8,14,7,23,5};
        int low = 0;
        int high = x.length - 1;

        quickSort(x,low, high);
        System.out.println(Arrays.toString(x));
    }
}

