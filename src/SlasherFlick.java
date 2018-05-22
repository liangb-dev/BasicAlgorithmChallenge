import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Return the remaining elements of an array after
 * chopping off n elements from the head.
 */
public class SlasherFlick extends BasicAlgorithm {
    /* Fields */
    private String[] n;
    private int num;


    /* Constructor */
    SlasherFlick(String[] n, int num) {
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
            default:
                System.out.println("Choice not available. Default choice:");
                method1();

        }
    }

    /**
     * I convert the original Array into a ListArray for easier handling.
     * Then I create a sub-List, splitting where required by the arguments.
     * The List is then converted back into an Array, and returned.
     * @return
     */
    private String[] method1() {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(n));
        List<String> temp = arr.subList(this.num,arr.size());
        String[] result = new String[temp.size()];
        result = temp.toArray(result);

        System.out.println("When you chop off " + this.num + " elements " +
                "from ");
        printArray(n);
        System.out.println("..you get: \n");
        printArray(result);

        return result;
    }

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
