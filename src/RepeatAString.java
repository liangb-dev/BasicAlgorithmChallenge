/**
 * Repeat a String a certain number of times
 */
public class RepeatAString extends BasicAlgorithm<String> {
    /* Fields */
    private String input;
    private int num;


    /* Constructor */
    RepeatAString(String input, int num) {
        this.input = input;
        this.num = num;
    }

    /* Choice Methods */
    /**
     * Repeats the required number of times using a while-loop
     * @return
     */
    protected String method1() {
        String result = "";
        int num = this.num;
        while (num > 0) {
            result += input + " ";
            num--;
        }
        result = result.substring(0,result.length()-1);

        System.out.println("The result of '" + input +"' repeated "
                + this.num + " times is: ");
        System.out.println(result);

        return result;
    }
}
