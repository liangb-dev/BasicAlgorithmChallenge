/**
 * Factorialize an integer
 */
public class Factorialize extends BasicAlgorithm {

    /* Fields */
    private int n;
    /* Constructor */
    Factorialize(int n){
        this.n = n;
    }


    /* Methods */

    /**
     * Choice method makes user interface universal
     * no matter how many methods a class has.
     * @param choice
     */
    public void method(int choice) {
        switch(choice) {
            case 1: method1();
            break;
            default:
                System.out.println("Choice not available. Default choice:");
                method1();
        }
    }

    /**
     * Factorializes an integer. Simply decrement while
     * multiplying to itself.
     * @return
     */
    public int method1() {
        int result = 1;
        int var_m = n;
        while (var_m > 0) {
            result = result * var_m;
            var_m--;
        }

        System.out.println("The factorial of " + n + "! is: " + result);
        return result;
    }
}
