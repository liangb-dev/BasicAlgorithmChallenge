/**
 * Title-cases a given sentence.
 * This means to capitalize the first letter
 * in every word of the sentence.
 */
public class TitleCaser extends BasicAlgorithm {
    /* Fields */
    private String n;


    /* Constructor */
    TitleCaser(String n) {
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

    private String method1() {
        String[] n_parsed = n.split(" ");
        String result = "";
        for (String word: n_parsed) {
            word = word.substring(0,1).toUpperCase() + word.substring(1,word.length());
            result += word + " ";
        }

        result = result.substring(0,result.length()-1);
        System.out.println("Here is your input title cased: '" + result + "'.");
        return result;
    }
}

