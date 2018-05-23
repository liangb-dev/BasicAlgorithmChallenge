/**
 * Truncate a String based on given maximum String length
 * and append '...' to the end of it.
 */
public class TruncateString extends BasicAlgorithm<String> {
    /* Fields */
    private String input;
    private int num;


    /* Constructor */
    TruncateString(String input, int num) {
        this.input = input;
        this.num = num;
    }


    /* Choice Methods */
        /**
     * Use the String.substring() method to adjust String to desired length
     * @return
     */
    protected String method1() {
        String result = input.substring(0,num) + "...";
        System.out.println("'" + input + "'");
        System.out.println("truncated to a String length of " + num +" is: ");
        System.out.println("'" + result + "'.");
        return result;
    }
}
