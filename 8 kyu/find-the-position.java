/*When provided with a letter, return its position in the alphabet.

Input :: "a"

Ouput :: "Position of alphabet: 1" */

//My solution

public class Kata
{
  public static String position(char alphabet)
  {
    int count = 0;
    String alphab = "abcdefghijklmnopqrstuvwxyz";
    for(int i = 0; i < alphab.length(); i++) {
      count++;
      if (alphabet == alphab.charAt(i)) {
        break;
      }
    }
    return "Position of alphabet: " + String.valueOf(count);
    }
}

//Second solution

public class Kata
{
  public static String position(char alphabet)
  {
    return "Position of alphabet: "+(alphabet-96);
  }
}
