

public class ContainDuplicate {

    public static void main(String[] args) {
        int[] data = { 1, 2, 3 };

        System.out.println(containsDuplicate(data));

    }

    public static boolean containsDuplicate(int[] nums) {
        boolean value = false;
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    value = true;
                    break;
                }
            }
        }

        return value;

    }


}
