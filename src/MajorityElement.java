import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {

            if (data.get(nums[i]) == null) {
                data.put(nums[i], 1);
            } else {
                data.put(nums[i], data.get(nums[i]) + 1);
            }
        }

        int t = 0;
        for (Map.Entry<Integer, Integer> check : data.entrySet()) {

            int val = check.getValue();
            if (val > t) {
                res = check.getKey();
                t = check.getValue();
            }
        }

        return res;

    }
}
