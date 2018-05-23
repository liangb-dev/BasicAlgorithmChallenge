/**
 * Finds the longest word in a given String
 */
public class StringsLongestWord extends BasicAlgorithm<String> {
    /* Fields */
    private String input;


    /* Constructor */
    StringsLongestWord(String input) {
        this.input = input;
    }

    /* Choice Methods */
    /**
     * After splitting the given String by its 'spaces' and converted
     * into an array, we iterate through this array once to see which
     * word is longest. The longest word is stored in variable 'max'
     * which is what's being returned.
     * @return 'max': the longest word
     */
    protected String method1() {
        String[] n_parsed = input.split(" ");

        String max = n_parsed[0];
        for (String word : n_parsed) {
            if (word.length() > max.length()) {
                max = word;
            }
        }

        System.out.println("The longest word in the String '" + input + "' is '" + max +"'.");
        return max;
    }
}
