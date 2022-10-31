import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram", t = "nagaram";

        isAnagram(s, t);

    }

    public static boolean isAnagram(String s, String t) {

        boolean isValid = false;

        HashMap<String, Integer> data = new HashMap<String, Integer>();

        for (int i = 0; i < s.length(); i++) {

            String c = s.charAt(i) + "";

            if (data.get(c) == null) {
                data.put(c, 1);
            } else {
                data.put(c,data.get(c)+1 );
            }

        }

        HashMap<String, Integer> data2 = new HashMap<String, Integer>();

        for (int i = 0; i < t.length(); i++) {

            String c = t.charAt(i) + "";

            if (data2.get(c) == null) {
                data2.put(c, 1);
            } else {
                data2.put(c,data2.get(c)+1 );
            }

        }


        if (data.equals(data2)) {
            isValid = true;
        }else{
            isValid = false;
        }


        return isValid;

    }
}
