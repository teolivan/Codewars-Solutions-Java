/*Triple Trouble
Create a function that will return a string that combines all of the letters of the three inputed strings in groups. Taking the first letter of all of the inputs and grouping them next to each other. Do this for every letter, see example below!

E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"

Note: You can expect all of the inputs to be the same length. */

public class Kata {
    public static String tripleTrouble(String one, String two, String three) {
      String combined = "";
      for(int i = 0; i < three.length(); i++) {
        combined+= Character.toString(one.charAt(i)) + Character.toString(two.charAt(i)) + Character.toString(three.charAt(i));
      }
      return combined;
    }
  }