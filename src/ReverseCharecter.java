
public class ReverseCharecter {
  public static void main(String[] args) {
    String sentence = "i love programming";
    System.out.println(rev(sentence));

  }

  static String reverseCharSpliString(String character) {

    String[] newData = character.split(" ");
    String result = "";

    for (int i = 0; i < newData.length; i++) {
      for (int j = newData[i].length() - 1; j >= 0; j--) {
        result = result + newData[i].charAt(j);
      }

      result = result + " "; // add space for every word
    }

    return result;

  }

  static String reverseChar(String character) {


    character = character + " ";

    String word = "";

    int startPoint = -1;
    int endPoint = 0;

    for (int i = 0; i < character.length(); i++) {

      String a = character.charAt(i) + "";
      if (a.equalsIgnoreCase(" ")) {

        endPoint = i;
        for (int j = endPoint; j > startPoint; j--) {
          word = word + character.charAt(j);
        }

        startPoint = i;

      }

    }

    return word.trim(); // trim for remove space

  }
}
