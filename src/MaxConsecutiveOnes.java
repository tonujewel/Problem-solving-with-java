public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int[] val = {  0, 1, 1, 0, 1, 1 ,1, 1, 1, 1, 1, 1,};

        findMaxConsecutiveOnes(val);

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int res = 0;
        int data = 0;
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] == 1) {
                data ++;              
                if (res < data) {
                    res = data;
                }
            } else {
                data = 0;
            }
        }
        return res;

    }

}
