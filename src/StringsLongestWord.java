/**
 * Finds the longest word in a given String
 */
public class StringsLongestWord extends BasicAlgorithm {
    /* Fields */
    private static String n;


    /* Constructor */
    StringsLongestWord(String n) {
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

    /**
     * After splitting the given String by its 'spaces' and converted
     * into an array, we iterate through this array once to see which
     * word is longest. The longest word is stored in variable 'max'
     * which is what's being returned.
     * @return 'max': the longest word
     */
    private String method1() {
        String[] n_parsed = n.split(" ");

        String max = n_parsed[0];
        for (String word : n_parsed) {
            if (word.length() > max.length()) {
                max = word;
            }
        }

        System.out.println("The longest word in the String '" + n + "' is '" + max +"'.");
        return max;
    }
}
