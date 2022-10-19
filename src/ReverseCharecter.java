public class ReverseCharecter {
  public static void main(String[] args) {
    String sentence = "I love programming";

  String val =   reverChar(sentence);
  System.out.println(val);
  }

  static String reverChar(String character) {

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
}
