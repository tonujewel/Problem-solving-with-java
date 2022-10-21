public class ContainDuplicate {

    public static void main(String[] args) {
        int[] data = { 1,2,3,1};
        containsDuplicate(data);
    }

    public static boolean containsDuplicate(int[] nums) {
        boolean value = false;
        for (int i = 0; i < nums.length-1; i++) {

            System.out.print(nums[i]);
            System.out.print(nums[i+1]);
            System.out.println(" ");

            while (value) {
                
            }

            if (nums[i]==nums[i+1]) {
                value=true;
            }

            // for (int j = i + 1; j < nums.length; j++) {
            //     if (nums[i] == nums[j]) {
            //         value = true;
            //     } 
            // }
        }
    System.out.println(value);
        return value;
    }

}
