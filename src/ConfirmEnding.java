/**
 * Confirms whether a String ends with a certain
 * sequence of characters.
 */
public class ConfirmEnding extends BasicAlgorithm {
    /* Fields */
    private static String original;
    private static String ending;


    /* Constructor */
    ConfirmEnding(String original, String ending) {
        this.original = original;
        this.ending = ending;
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
                //method1();

        }
    }

    /**
     * Using 'String'.endsWith() we check whether given String ends with
     * give String.
     * @return
     */
    private boolean method1() {
        boolean indictment = ((original.endsWith(ending))? true : false);
        System.out.println("It is " + ((indictment)? "TRUE":"FALSE") +
                " that the word '" + original + "' ends with '" + ending + "'.");
        return indictment;
    }
}
