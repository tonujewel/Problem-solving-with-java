import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheMedian {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);

        findMedian(list);

    }

    public static int findMedian(List<Integer> arr) {

        int[] array = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {

            array[i] = arr.get(i);

        }

        Arrays.sort(array);

        System.out.println("jewel" + array[array.length / 2]);

        return array[array.length / 2];
    }
}
