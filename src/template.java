/**
 * This is just a Mutations for Class consistency
 * between each challenge (class)
 */
public class template extends BasicAlgorithm {
    /* Fields */
    private int n;


    /* Constructor */
    template(int n) {
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
            case 1:
                //method1();
                break;
            default:
                System.out.println("Choice not available. Default choice:");
                //method1();

        }
    }
}
