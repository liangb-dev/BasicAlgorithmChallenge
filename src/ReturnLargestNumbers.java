import java.util.ArrayList;

/**
 * Iterates through a matrix and returns an array of the largest
 * numbers from each subarray of the matrix.
 */
public class ReturnLargestNumbers extends BasicAlgorithm<ArrayList<Integer>> {
    /* Fields */
    private int[][] input;


    /* Constructor */
    ReturnLargestNumbers(int[][] input) {
        this.input = input;
    }

    /* Choice Methods */
    /**
     * iterates through every subarray in the matrix, each time initializing
     * a new 'max' which, by the end of the subarray iteration, will store
     * the subarray's largest number. Then max is stored into an ArrayList.
     * This ArrayList stores the largest numbers from each subarray.
     * @return ArrayList of largest numbers
     */
    protected ArrayList<Integer> method1() {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int[] array : input) {
            int max = array[0];
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
            result.add(max);
        }

        System.out.println("The largest numbers of your matrix: ");
        printMatrix(input);
        System.out.println("..are the following: ");
        printArrayList(result);

        return result;
    }

    /* Utility Methods */
    /**
     * Just a method used to print the matrix
     * @param x
     */
    private void printMatrix(int[][] x) {
        for (int[] array : x) {
            String line = "";
            for (int num : array) {
                line += Integer.toString(num) + " ";
            }
            System.out.println(line);
        }
        System.out.println("\n");
    }


    /**
     * Just a method used to print the ArrayList
     * @param x
     */
    private void printArrayList(ArrayList<Integer> x) {
        String line = "";
        for (int num : x) {
            line += Integer.toString(num) + " ";
        }
        System.out.println(line + "\n");
    }
}

