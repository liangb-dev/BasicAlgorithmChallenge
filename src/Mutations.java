/**
 * Return true if the String in the first element of the array
 * contains all of the letters of the String in the second
 * element of the Array.
 */
public class Mutations extends BasicAlgorithm<Boolean> {
    /* Fields */
    private String[] input;

    /* Constructor */
    Mutations(String[] input) {
        this.input = input;
    }


    /* Choice Methods */
    protected Boolean method1() {
        String first = input[0];
        String second = input[1];

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
