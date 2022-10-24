import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SaledByMatch {
    public static void main(String[] args) {

        List<Integer> ar = new ArrayList<>();
        //
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(3);
        ar.add(2);

        sockMerchant(ar.size(), ar);

    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int pair = 0;
        HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {

            if (data.get(ar.get(i)) == null) {
                data.put(ar.get(i), 1);
            } else {
                int temp = data.get(ar.get(i));
                temp++;
                data.put(ar.get(i), temp);
            }
        }

        for (int i : data.values()) {
            pair = pair + (i / 2);
        }
        return pair;

    }
}
