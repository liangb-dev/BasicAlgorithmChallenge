/**
 * Title-cases a given sentence.
 * This means to capitalize the first letter
 * in every word of the sentence.
 */
public class TitleCaser extends BasicAlgorithm<String> {
    /* Fields */
    private String input;


    /* Constructor */
    TitleCaser(String input) {
        this.input = input;
    }


    /* Choice Methods */

    /**
     * Parses up given String by String.input(" "), then iterates
     * through the array changing the first letter of each word
     * into uppercase.
     * It skips
     * @return
     */
    protected String method1() {
        String[] n_parsed = input.split(" ");
        String result = "";
        for (String word: n_parsed) {
            if (word.length() < 1 || word.substring(0,1) == " " ) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1, word.length());
                result += word + " ";
            }
            else {

            }
        }

        result = result.substring(0,result.length()-1);
        System.out.println("Here is your input title cased: '" + result + "'.");
        return result;
    }

}

