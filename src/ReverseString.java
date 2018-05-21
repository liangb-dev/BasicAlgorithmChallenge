import java.util.Arrays;

/**
 * Reverse a String
 */
public class ReverseString extends BasicAlgorithm {

    /* Fields */
    private String n;
    /* Constructor */
    ReverseString(String n) {
        this.n = n;
    }

    /* Methods */

    /**
     * Choice method makes user interface universal
     * no matter how many methods a class has.
     * @param choice
     */
    public void method(int choice) {
        switch (choice) {
            case 1: method1();
            break;
            case 2: method2();
            break;
            default:
                System.out.println("Choice not available. Default choice:");
                method1();
        }
    }

    /**
     * Method 1: External String
     * I came up with this one myself, and find it
     * easier than the method below which I found
     * as a solution online.
     * Method 1 simply iterates through a String
     * and appends the characters reverse order to
     * another String.
     * Big O -wise this method iterates through entire
     * String whereas method 2 iterates only through
     * half of the length of the String. So in that
     * respect I suppose it's cleverer.
     * @return
     */
    private String method1() {

        /* Method 1: External String */
        String result = "";
        for (int i=n.length()-1;i>-1;i--) {
            result += n.charAt(i);
        }
        System.out.println("Using method 1 (External String): ");
        System.out.println("The reverse of '" + n + "' is '" + result + "'.");
        return result;
    }

    /**
     * Method 2: Array Manipulation
     * This was the "official" googled solution, which
     * seems a little more tedious considering the extra
     * number of variables intialized. But it appears clever.
     * It's also BigO=N/2 compared to method 1 with BigO=N.
     * @return
     */
    private String method2() {
        int start = 0;
        int end = n.length() - 1;

        String[] parsed_n = n.split("");
        String tmp;

        while (start < end) {
            tmp = parsed_n[start];
            parsed_n[start] = parsed_n[end];
            parsed_n[end] = tmp;
            start++;
            end--;
        }

        String result = "";
        for (String l : parsed_n) {
            result += l;
        }
        System.out.println("Using method 2 (CharArray Manipulation): " );
        System.out.println("The reverse of '" + n + "' is '" + result + "'.");

        return result;

    }
}
