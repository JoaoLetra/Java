
public class ShellSort {

    private long[] data;

    private int len;

    public ShellSort(int max) {
        data = new long[max];
        len = 0;
    }

    public void insert(long value) {
        data[len] = value;
        len++;
    }

    public void display() {

        for (int j = 0; j < len; j++) {
            System.out.print(data[j] + " ");
        }
        System.out.println("");
    }

    public void shellSort() {
        long starts = System.nanoTime();

        int inner, outer;
        long temp;
        //encontra o valor inicial do h
        int h = 1;
        while (h <= len / 3) {
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }
        while (h > 0) // h decresce at� h=1
        {

            for (outer = h; outer < len; outer++) {
                temp = data[outer];
                inner = outer;

                while (inner > h - 1 && data[inner - h] >= temp) {
                    data[inner] = data[inner - h];
                    inner -= h;
                }
                data[inner] = temp;
            }
            h = (h - 1) / 3; // decresce h
        }
        long ends = System.nanoTime();
        long finalTime = ends - starts;

        System.out.println("Time in ns: " + finalTime);
    }

    public static void main(String[] args) {
        int maxSize = 10000000; //define the array size
        ShellSort arr = new ShellSort(maxSize);

        for (int j = 0; j < maxSize; j++) {
            long n = (int) (java.lang.Math.random() * 9);
            arr.insert(n);
        }
        System.out.print("Array: ");
        arr.display();
        arr.shellSort();
        System.out.print("Sort array: ");

    }
}
