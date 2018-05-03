
import java.util.Random;

public class HeapSort {

    public static void buildheap(int[] arr) {

        /*
     * As last non leaf node will be at (arr.length-1)/2 
     * so we will start from this location for heapifying the elements
     * */
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            heapify(arr, i, arr.length - 1);
        }
    }

    public static void heapify(int[] arr, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max;
        if (left <= size && arr[left] > arr[i]) {
            max = left;
        } else {
            max = i;
        }

        if (right <= size && arr[right] > arr[max]) {
            max = right;
        }
        // If max is not current node, exchange it with max of left and right child
        if (max != i) {
            exchange(arr, i, max);
            heapify(arr, max, size);
        }
    }

    public static void exchange(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static int[] heapSort(int[] arr) {

        buildheap(arr);
        int sizeOfHeap = arr.length - 1;
        for (int i = sizeOfHeap; i > 0; i--) {
            exchange(arr, 0, i);
            sizeOfHeap = sizeOfHeap - 1;
            heapify(arr, 0, sizeOfHeap);
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.print("Array: ");
        int[] array = new int[10]; //define the array size
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(9);
            System.out.print(array[i] + " ");
        }

        System.out.println("");

        long starts = System.nanoTime();

        array = heapSort(array);

        long ends = System.nanoTime();
        long finalTime = ends - starts;

        System.out.println("Time in ns: " + finalTime);
        System.out.print("Sort array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
