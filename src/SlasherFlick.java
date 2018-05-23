import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Return the remaining elements of an array after
 * chopping off input elements from the head.
 */
public class SlasherFlick extends BasicAlgorithm<String[]> {
    /* Fields */
    private String[] input;
    private int num;


    /* Constructor */
    SlasherFlick(String[] input, int num) {
        this.input = input;
        this.num = num;
    }


    /* Choice Methods */
    /**
     * I convert the original Array into a ListArray for easier handling.
     * Then I create a sub-List, splitting where required by the arguments.
     * The List is then converted back into an Array, and returned.
     * @return
     */
    protected String[] method1() {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(input));
        List<String> temp = arr.subList(this.num,arr.size());
        String[] result = new String[temp.size()];
        result = temp.toArray(result);

        System.out.println("When you chop off " + this.num + " elements " +
                "from ");
        printArray(input);
        System.out.println("..you get: \n");
        printArray(result);

        return result;
    }

    /* Utility Methods */
    /**
     * Function that prints an array inline
     * @param arr
     */
    private void printArray(String[] arr) {
        String line = "";
        for (String obj : arr) {
            line += obj + " ";
        }
        System.out.println("'" + line.substring(0,line.length()-1) + "'");
    }
}
