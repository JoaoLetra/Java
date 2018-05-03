
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

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

        for (int i = 0; i < A.length - 1; i++) {

            int I1 = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[I1]) {
                    I1 = j;
                }
            }

            int temp = A[I1];
            A[I1] = A[i];
            A[i] = temp;

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
