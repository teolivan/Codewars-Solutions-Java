/*Given a string made up of letters a, b, and/or c, switch the position of letters a and b (change a to b and vice versa). Leave any incidence of c untouched.

Example:

'acb' --> 'bca'
'aabacbaa' --> 'bbabcabb' */

//My solution

public class Switch {
    public static String switcheroo(String x) {
    
      StringBuilder sb = new StringBuilder(x);
      for(int i = 0; i < x.length(); i++) {
        if(sb.charAt(i) == 'a') {
          sb.setCharAt(i, 'b');
        } else if (sb.charAt(i) == 'b') {
          sb.setCharAt(i, 'a');
        }
      }
  
  
  String newString = sb.toString();
      return newString;
      
    }
    
  }