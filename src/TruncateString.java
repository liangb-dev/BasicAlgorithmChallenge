/**
 * Truncate a String based on given maximum String length
 * and append '...' to the end of it.
 */
public class TruncateString extends BasicAlgorithm {
    /* Fields */
    private static String n;
    private static int num;


    /* Constructor */
    TruncateString(String n, int num) {
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
     * Use the String.substring() method to adjust String to desired length
     * @return
     */
    private String method1() {
        String result = n.substring(0,num) + "...";
        System.out.println("'" + n + "'");
        System.out.println("truncated to a String length of " + num +" is: ");
        System.out.println("'" + result + "'.");
        return result;
    }
}
