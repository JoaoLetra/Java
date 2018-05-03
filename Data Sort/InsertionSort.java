
import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {

        System.out.print("Array: ");
        int[] array = new int[10]; //define the array size
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(9);
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        sort(array);
        printA(array);
    }

    public static int[] sort(int[] A) {

        long starts = System.nanoTime();
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
        long ends = System.nanoTime();
        long finalTime = ends - starts;

        System.out.println("Time in ns: " + finalTime);
        System.out.print("Sort array: ");
        return A;
    }

    public static void printA(int[] A) {

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }

}
