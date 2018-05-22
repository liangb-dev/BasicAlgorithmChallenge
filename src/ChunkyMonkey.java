import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Split given String Array into a given number of sub-arrays.
 * Return an Array of String sub-arrays.
 *
 * !However, the original question assumes this method can handle any
 * type of Array as input (not strictly String).
 * !Moreover, I think in the original question the given number,
 * 'num' in our case, is not the fixed number of subarrays, but the
 * fixed number of elements in the subarrays. So the limiting number
 * is not how many 'containers' but the capacity of A container (meaning
 * you can have any number of containers, as long as each only fits 'num'
 * amount of items).
 */
public class ChunkyMonkey extends BasicAlgorithm {
    /* Fields */
    private String[] n;
    private int num;


    /* Constructor */
    ChunkyMonkey(String[] n, int num) {
            this.n = n;
            this.num = num;

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
            case 2:
                method2();
                break;
            default:
                System.out.println("Choice not available. Default choice:");
                method1();

        }
    }

    /**
     * Disregards order of items.
     * Adds items into a number of ArrayList (depending on how many
     * containers) in a Queue-esque style. The end result is evenly
     * divided items in the required number of containers.
     * @return
     */
    private ArrayList<ArrayList<String>> method1() {

        ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
        ArrayList<String> n_clone = new ArrayList<>(Arrays.asList(n));

        // Create equal amount of containers as requested.
        for (int i=0;i<num;i++) {
            arr.add(new ArrayList<String>());
        }

        // Iterate through given Array while putting items
        // into the containers you just created.
        Iterator itor = n_clone.iterator();
        int count = 0;
        while (itor.hasNext()) {
            if (count < this.num) {
                arr.get(count).add((String)itor.next());
                count++;
            } else {
                count = 0;
            }
        }

        System.out.println("Paying no attention to order, the Array - ");
        printArrayList(new ArrayList<>(Arrays.asList(n)));
        System.out.println("divided into " + this.num + " sections is: \n");
        printMatrix(arr);

        return arr;
    }

    /**
     * In respect to the order that the given Array was originally in.
     * The general idea is the same as that of method1().
     * The difference is in the way that the items are places into the
     * containers.
     * int whole - the integer result of a division is the number of items
     *             that each container will hold on average.
     * int rem - the remainder are the number of 'exceptions', i.e. the
     *            number of containers that will hold an extra item.
     * I added the average (int whole) number of items to each container.
     * Using 'int rem' to count the number of exceptions, I allowed a limit
     * of one extra item per container (total of 'int whole'+1) for as long
     * as there were 'exceptions ('int rem != 0) leftover. When the
     * 'int rem' ran out, the remainder of containers don't get anymore
     * extra items and will have to stick to the 'average number' (int whole).
     *
     * @return sorted Matrix
     */
    private ArrayList<ArrayList<String>> method2() {
        ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
        ArrayList<String> n_clone = new ArrayList<>(Arrays.asList(n));

        int whole = Math.floorDiv(n.length,this.num);
        int rem = n.length - whole*this.num; // 'rem' can be interpreted as number of exceptions
        // where each exception gets an extra item

        // Create equal number of containers as requested
        for (int i=0;i<this.num;i++) {
            arr.add(new ArrayList<String>());
        }

        // Iterate through given Array while putting items into containers
        Iterator itor = n_clone.iterator();
        int count = 0;
        while (itor.hasNext()) {
            for (int i = 0; i < whole; i++) {
                if (itor.hasNext()) {
                    arr.get(count).add((String)itor.next());
                } else {
                    break;
                }
            }
            if (rem != 0 && itor.hasNext()) {
                arr.get(count).add((String)itor.next());
                rem--;
            }
            count++;
        }

        printMatrix(arr);

        return arr;
    }

    /**
     * Just a method used to print the matrix
     * @param x
     */
    private void printMatrix(ArrayList<ArrayList<String>>  x) {
        for (ArrayList<String>  array : x) {
            String line = "";
            for (String word: array) {
                line += word + " ";
            }
            System.out.println(line);
        }
        System.out.println("\n");
    }

    /**
     * Just a method used to print the ArrayList
     * @param x
     */
    private void printArrayList(ArrayList<String> x) {
        String line = "";
        for (String word : x) {
            line += word + " ";
        }
        System.out.println("'" + line.substring(0,line.length()-1) + "'\n");
    }
}
