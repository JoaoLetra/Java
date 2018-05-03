
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.print("Array: ");
        int[] array = new int[10]; //define the array size
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(9);
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        int num;
        boolean validate = false;

        long starts = System.nanoTime();

        do {

            validate = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {

                    num = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = num;

                    validate = false;
                }
            }
        } while (validate == false);

        long ends = System.nanoTime();
        long finalTime = ends - starts;

        System.out.println("Time in ns: " + finalTime);
        System.out.print("Sort array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
