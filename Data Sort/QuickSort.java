
import java.util.Random;

public class QuickSort {

    private static void QuickSort(int[] arr, int left, int right) {

        int index = partition(arr, left, right);

        if (left < index - 1) {
            QuickSort(arr, left, index - 1);
        }

        if (index < right) {
            QuickSort(arr, index, right);
        }

    }

    private static int partition(int[] arr, int left, int right) {

        int pivot = arr[(left + right) / 2];

        while (left <= right) {

            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;

                left++;
                right--;

            }

        }
        return left;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Array: ");
        int[] array = new int[10]; //define the array size
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(9);
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        long starts = System.nanoTime();

        QuickSort(array, 0, array.length - 1);
        long ends = System.nanoTime();
        long finalTime = ends - starts;

        System.out.println("Time in ns: " + finalTime);
        System.out.print("Sort array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
