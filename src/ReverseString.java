import java.util.ArrayList;
import java.util.List;

public class ReverseString {

  static String solve(String A) {

    A = A + " ";
    String temp = "";

    int sp = 0;
    int ep = 0;

    List<String> ar = new ArrayList<String>();
    List<String> res = new ArrayList<String>();

    //
    for (int i = 0; i < A.length(); i++) {

      String ch = A.charAt(i) + "";

      if (ch.equalsIgnoreCase(" ")) {
        ep = i;

        String d = "";
        for (int j = sp; j < ep; j++) {
          d = d + A.charAt(j);
        }
        ar.add(d);
        sp = i + 1;
      }
    }
    // reverse and
    for (int j = ar.size() - 1; j >= 0; j--) {
      res.add(ar.get(j));
    }

    String result = res + "";

    for (int i = 0; i < result.length(); i++) {

      String ch = result.charAt(i) + "";

      if (!ch.equalsIgnoreCase("[") && !ch.equalsIgnoreCase(",") && !ch.equalsIgnoreCase("]")) {

        temp = temp + ch;
      }

    }

    String daataaa = removeWhiteSpaces(temp);
    return daataaa;
  }

  public static String removeWhiteSpaces(String returnString) {
    returnString = returnString.trim().replaceAll("^ +| +$|( )+", " ");
    return returnString;
  }

}
