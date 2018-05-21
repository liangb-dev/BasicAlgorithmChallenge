/**
 * Check if a String is a Palindrome
 */
public class CheckPalindrome extends BasicAlgorithm {

    /* Fields */
    private static String n;

    /* Constructor */
    CheckPalindrome(String n) {
        this.n = n;
    }

    /* Methods */
    /**
     * Choice method makes user interface universal
     * no matter how many methods a class has.
     * @param choice
     */
    public void method(int choice) {
        switch (choice) {
            case 1:
                method1();
                break;
            default:
                System.out.println("Choice not available. Default choice:");
                method1();
        }
    }

    /**
     * Taking inspiration from the Googled method of reversing
     * a string, I reduced the number of variables so that the
     * 'start' can help represent the 'end'. You simply check the
     * letters at the same time using an indexer and getChar. If
     * the word mirrors itself, the checking will continue until
     * we finish and return true. Where it doesnt the algorithm
     * will just return false.
     * @return
     */
    public Boolean method1() {
        String result = "";

        int i = 0;

        while (i < n.length()-1-i) {
            if (n.charAt(i) != (n.charAt(n.length()-1-i))) {
                System.out.println("'"+ n + "' is NOT a Palindrome. ");
                return false;
            }
            i++;
        }
        System.out.println("'"+ n + "' is a Palindrome. ");
        return true;
    }
}




