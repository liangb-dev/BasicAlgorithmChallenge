/**
 * Return true if the String in the first element of the array
 * contains all of the letters of the String in the second
 * element of the Array.
 */
public class Mutations extends BasicAlgorithm {
    /* Fields */
    private String[] n;

    /* Constructor */
    Mutations(String[] n) {
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
                method1();
                break;
            default:
                System.out.println("Choice not available. Default choice:");
                method1();

        }
    }

    private boolean method1() {
        String first = n[0];
        String second = n[1];

        for (int i = 0; i < second.length();i++) {
            if (!first.contains(Character.toString(second.charAt(i)))){
                System.out.println("The String '" + first + "' DOES NOT " +
                        "contain all letters from '" + second + "'.");
                return false;
            }
        }
        System.out.println("The String '" + first +
                "' contains all letters from '" + second + "'.");
        return true;
    }
}
