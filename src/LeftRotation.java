import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<Integer>();
        int d = 4;

        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        rotateLeft(d, arr);

    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here

        List<Integer> res = new ArrayList<>();

        int c=0;

        for (int i = 0; i < arr.size(); i++) {

            if (i>(d-1)) {
                res.add(c,arr.get(i));
                c++;                
            }else{
                res.add(arr.get(i));
            }

        }

        return res;

    }
}
