/**
 * Confirms whether a String ends with a certain
 * sequence of characters.
 */
public class ConfirmEnding extends BasicAlgorithm<Boolean> {
    /* Fields */
    private String original;
    private String ending;


    /* Constructor */
    ConfirmEnding(String original, String ending) {
        this.original = original;
        this.ending = ending;
    }

    /* Choice Methods */
    /**
     * Using 'String'.endsWith() we check whether given String ends with
     * give String.
     * @return
     */
    protected Boolean method1() {
        boolean indictment = ((original.endsWith(ending))? true : false);
        System.out.println("It is " + ((indictment)? "TRUE":"FALSE") +
                " that the word '" + original + "' ends with '" + ending + "'.");
        return indictment;
    }
}
