/**
 * Repeat a String a certain number of times
 */
public class RepeatAString extends BasicAlgorithm {
    /* Fields */
    private int num;
    private String n;


    /* Constructor */
    RepeatAString(String n, int num) {
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
     * Repeats the required number of times using a while-loop
     * @return
     */
    private String method1() {
        String result = "";
        int num = this.num;
        while (num > 0) {
            result += n + " ";
            num--;
        }
        result = result.substring(0,result.length()-1);

        System.out.println("The result of '" + n +"' repeated "
                + this.num + " times is: ");
        System.out.println(result);

        return result;
    }
}
