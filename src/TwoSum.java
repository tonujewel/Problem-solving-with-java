public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length ; i++) {

            for(int j=i+1; j<nums.length;j++){

                if ((nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }

        }

        System.out.println(result[0]);
        System.out.println(result[1]);
        return result;

    }

}
