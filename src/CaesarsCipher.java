/**
 * Caesar Cipher is used according to the ROT13 cipher,
 * where the values of letter are shifted by 13 places.
 * The function takes a ROT13 encoded String as input and
 * returns a decoded String.
 * A function to encode a String and return an ROT13
 * encoded String is also written.
 *
 */
public class CaesarsCipher extends BasicAlgorithm<String> {
    /* Fields */
    private String input;


    /* Constructor */
    CaesarsCipher(String input) {
        this.input = input;
    }


    /* Choice Methods */
    /**
     * Decode provided String that's been ROT13 encoded
     * @return
     */
    protected String method1() {
        String result = ROT13Decode(this.input);

        System.out.println("Trying to decode: ");
        System.out.println(input);
        System.out.println(".\n.\n.\n");
        System.out.println("'" + result + "'");

        return "";
    }

    /* Utility Methods*/
    /**
     * Takes an ROT13 encoded String and decodes it
     * back to a regular String.
     * @param str
     * @return
     */
    private String ROT13Decode(String str) {
        String decoded = str;

        for(int i=0; i<decoded.length();i++) {
            if(Character.isAlphabetic(decoded.charAt(i))) {

                decoded = decoded.substring(0,i) + ROT13CharDecoder(decoded.charAt(i))
                        + decoded.substring(i+1,decoded.length());
            }
        }

        return decoded;
    }


    /**
     * Takes a regular String and encodes it with
     * ROT13 specification.
     * @param str
     * @return
     */
    private String ROT13Encode(String str) {
        String encoded = str;

        for(int i=0; i<encoded.length();i++) {
            if(Character.isAlphabetic(encoded.charAt(i))) {

                encoded = encoded.substring(0,i) + ROT13CharEncoder(encoded.charAt(i))
                        + encoded.substring(i+1,encoded.length());
            }
        }

        return encoded;
    }


    /**
     * Converts a 'Char a' by the ROT13 standard to an
     * encoded 'Char b'.
     * @param a
     * @return
     */
    private char ROT13CharEncoder(char a) {
        // Convert 'char a' to integer between 0-25
        int a_indx = (int)a - 65;
        // Perform +13 and modulo% so it remains
        // between 0 - 25
        int b_indx = (a_indx+13)%26 + 65;

        // return Char
        return (char)b_indx;
    }


    /**
     * Converts a 'Char b' by the ROT13 standard to an
     * decoded 'Char a'.
     * @param b
     * @return
     */
    private char ROT13CharDecoder(char b) {
        int a_indx = ((int)b - 65) - 13;

        if (a_indx < 0) {
            a_indx = 26 + a_indx;
        }
        a_indx += 65;
        return (char)a_indx;
    }
}
