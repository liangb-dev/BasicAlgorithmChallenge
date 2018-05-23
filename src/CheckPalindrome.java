/**
 * Check if a String is a Palindrome
 */
public class CheckPalindrome extends BasicAlgorithm<Boolean> {

    /* Fields */
    private String input;

    /* Constructor */
    CheckPalindrome(String n) {
        this.input = n;
    }

    /* Choice Methods */
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

        while (i < input.length()-1-i) {
            if (input.charAt(i) != (input.charAt(input.length()-1-i))) {
                System.out.println("'"+ input + "' is NOT a Palindrome. ");
                return false;
            }
            i++;
        }
        System.out.println("'"+ input + "' is a Palindrome. ");
        return true;
    }
}




