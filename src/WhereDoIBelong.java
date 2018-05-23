/**
 * Checks where the given 'integer x' would fit into
 * the given 'Array input' after that the Array has been
 * sorted. It returns the index position of where it
 * would fit.
 */
public class WhereDoIBelong extends BasicAlgorithm<Integer> {
    /* Fields */
    private int[] input;
    private int x;


    /* Constructor */
    WhereDoIBelong(int[] input, int x) {
        this.input = input;
        this.x = x;
    }


    /* Choice Methods */
    /**
     * After sorting the Array, the function iterates through the
     * sorted Array while check where in it the given 'integer x'
     * would fit. When a number greater than 'integer x' is found
     * then that's where it fits, and that's the index returned.
     * @return
     */
    protected Integer method1() {

        // First sort the int[] Array
        int[] sorted_n = copyArray(input);
        sortArray(sorted_n);

        // then compare the given value 'int x'
        // for where it would belong in the Array
        int min = 0;
        for (int i = 0; i < this.input.length; i++) {
            if (sorted_n[i] >= this.x) {
                min = i;
                break;
            }
            min = this.input.length;
        }

        System.out.println("The array ");
        printArray(this.input);
        System.out.println("after being sorted is ");
        printArray(sorted_n);
        System.out.println("and within that, the number " + Integer.toString(x)
                + " would have minimum index of " + min + ".");

        return min;
    }


    /* Utility Methods */
    /**
     * Rather cumbersome Bubblesort
     * @param arr0
     * @return
     */
    private int[] sortArray(int[] arr0) {

        int[] arr = arr0;

        while (!isArraySorted(arr)) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i; j < arr.length - 1; j++) {
                    if (arr[i] >= arr[j + 1]) {
                        arr = swapArrayElements(arr, i, j + 1);
                    } else {
                        break;
                    }
                }
            }
        }
        return arr;

    }

    /**
     * Helps swap two elements in a given Array
     * @param arr
     * @param index1
     * @param index2
     * @return
     */
    private int[] swapArrayElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }


    /**
     * Prints an Array inline
     * @param arr
     */
    private void printArray(int[] arr) {
        String line = "";
        for (int obj : arr) {
            line += Integer.toString(obj) + " ";
        }
        System.out.println("'" + line.substring(0,line.length()-1) + "'");
    }

    /**
     * Judges whether the given Array has been sorted.
     * @param arr
     * @return
     */
    private boolean isArraySorted(int[] arr) {
        for (int i=0;i<arr.length-1;i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns a copy of the given Array
     * @param arr0
     * @return
     */
    private int[] copyArray(int[] arr0) {
        int[] arr = new int[arr0.length];
        int i = 0;
        for (int a : arr0) {
            arr[i] = a;
            i++;
        }
        return arr;
    }
}
