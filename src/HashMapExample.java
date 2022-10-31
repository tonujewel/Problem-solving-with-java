import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        // HashMap <String , Integer> data = new HashMap<String , Integer>();

        // data.put("jewel", 1);
        // data.put("jewel", 2);

        // data.get("jewel");

        int[] numbers = { 1, 5, 7, 20, 35,90 };

        twoSum(numbers, 8);

    }

    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

        for (int i = 0,j=numbers.length-1; i < numbers.length/2; i++,j--) {

           
            System.out.println(numbers[j]+" "+numbers[i]);
            System.out.println("==");

        }

        int[] result = new int[2];
        return result;

    }
}
