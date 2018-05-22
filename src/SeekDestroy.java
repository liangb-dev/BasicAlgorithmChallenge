/**
 * Takes in an int[] Array and also an arbitrary number of
 * integers (using varargs). All vararg integers must be
 * eliminated from the given int[] Array.
 */

public class SeekDestroy extends BasicAlgorithm {
    /* Fields */
    private int[] n;
    private int[] a;

    /* Constructor */
    SeekDestroy(int[] n, int ... a) {
        this.n = n;
        this.a = a;
    }


    /* Methods */

    /**
     * Choice method makes user interface universal
     * no matter how many methods a class has.
     * @param choice
     */
    public void method(int choice) {
        switch(choice) {
            case 1:
                method1();
                break;
            default:
                System.out.println("Choice not available. Default choice:");
                method1();

        }
    }

    /**
     * I refrained from using any external methods to manipulate the Array,
     * and made my own methods to finds its size and to eliminate an element
     * from it.
     * After that I looped through the int vararg arguments and checked the
     * given int[] Array for matches. If a match was found, then those elements
     * within int[] Array would be removed.
     * @return
     */
    private int[] method1() {
        int[] result = n;

        for (int x : a) {
            for (int y : n) {
                if (x == y) {
                    result = removeElement(result, x);
                }
            }
        }

        System.out.println("When you remove ");
        printArray(a);
        System.out.println("from the array ");
        printArray(n);
        System.out.println("you'll get \n");
        printArray(result);


        return result;
    }

    /**
     * Removes an element 'int x' from an Array 'int[] arr'
     * @param arr
     * @param x
     * @return
     */
    public int[] removeElement(int[] arr, int x) {
        int count = 0;
        int size = getArrayLength(arr);

        // count how many matches there are
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }

        // create array of new size
        int[] g = new int[size-count];

        // copy over elements that aren't 'int x'
        int j = 0;
        for (int i : arr) {
            if (i != x) {
                g[j] = i;
                j++;
            }
        }


        return g;
    }

    /**
     * Finds out the length of an Array
     * @param arr
     * @return
     */
    private int getArrayLength(int[] arr) {
        int count = 0;
        for(int x: arr) {
            count++;
        }
        return count;
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
}
