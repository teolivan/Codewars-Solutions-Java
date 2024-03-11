/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
*/

public class XO {

    public static boolean getXO(String str) {
        int countx = 0;
        int counto = 0;
        String lowerstring = str.toLowerCase();
        int size = lowerstring.length();

        char[] arrstr = new char[lowerstring.length()];

        for (int i = 0; i < size; i++) {
            arrstr[i] = lowerstring.charAt(i);
        }

        for (int i = 0; i < size; i++) {
            if (arrstr[i] == 'x' || arrstr[i] == 'X') {
                countx++;
            }
            if (arrstr[i] == 'o' || arrstr[i] == 'O') {
                counto++;
            }
        }

        return countx == counto;

    }
}