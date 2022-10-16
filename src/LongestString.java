public class LongestString {
    public static void main(String[] args) {
        String[] myString = {"I", "love", "my country", "very", "much"};

       for (int i = 0; i < myString.length-1; i++) {

        if (myString[i].length()>myString[i+1].length()) {
            System.out.println(myString[i]);
        }
         
       }
    }
}
