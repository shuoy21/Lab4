/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

    /**@param
     * this class returns the longest common substring of two strings
     */
public class ReclamationProject {
    /**
     * @param first gives one string
     * @param second gives another string
     * @return the longest common substring
     */
    static String doit(final String first, final String second) {
        String newFirst = "";
        String newSecond = "";
        if (first.length() > second.length()) {
            String holdFirst = first; // TO DO: set c to a
            newFirst = second;
            newSecond = holdFirst;
            } // make sure a is a shorter string
        //String r = (a.equals(b)) ? "" : ""; // I love the ternary operator!
        String r = "";
        /*
         * For loop with i
         */
        /*for (int i = 0; i < newFirst.length(); i++) { // first: [0, length)
            for (int j = newFirst.length() - i; j > 0; j--) { // first: (length, 0]
                for (int k = 0; k < newSecond.length() - j; k++) { //second: [0, length)
                    if (newFirst.regionMatches(i, newSecond, k, j)) {
                        r = newFirst.substring(i, i + j); // Do it!
                    }
                        }
                } // Ah yeah
        }
        */
        for (int i = 0; i < newFirst.length(); i++) {
            String possibleCommon = newFirst.substring(i);
            if (newSecond.contains(possibleCommon)) {
                r = possibleCommon;
                break;
            }
        }
        return r;
        }
}
