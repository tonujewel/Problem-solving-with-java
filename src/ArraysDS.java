import java.util.ArrayList;
import java.util.List;

public class ArraysDS {
    public static void main(String[] args) {

        // List<Integer> a = new List[{1,2,3,2,1,4}];
        List<Integer> a = new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(5);

        reverseArray(a);

    }

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> res = new ArrayList<Integer>();
        for (int i = a.size()-1; i >= 0; i--) {
            res.add(a.get(i));
        }
        return res;

    }
}
