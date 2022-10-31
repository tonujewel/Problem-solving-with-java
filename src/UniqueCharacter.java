import java.util.HashMap;

public class UniqueCharacter {
    public static void main(String[] args) {

        String s = "leetcode";

        firstUniqChar(s);

    }

    public static int firstUniqChar(String s) {

        int index = 0;
        HashMap<Character, Integer> data = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (data.get(c) == null) {
                data.put(c, 1);
            } else {
                data.put(c, data.get(c) + 1);
            }
        }

        System.out.println(data);

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (data.get(c) == 1) {
                index = i;
                break;
            } else {
                index = -1;
            }

        }

        return index;

    }
}
