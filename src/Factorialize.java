/**
 * Factorialize an integer
 */
public class Factorialize extends BasicAlgorithm<Integer> {

    /* Fields */
    private int input;
    /* Constructor */
    Factorialize(int input){
        this.input = input;
    }


    /* Choice Methods */
    /**
     * Factorializes an integer. Simply decrement while
     * multiplying to itself.
     * @return
     */
    protected Integer method1() {
        int result = 1;
        int var_m = input;
        while (var_m > 0) {
            result = result * var_m;
            var_m--;
        }

        System.out.println("The factorial of " + input + "! is: " + result);
        return result;
    }
}
