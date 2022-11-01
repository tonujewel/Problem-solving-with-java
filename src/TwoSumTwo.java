
public class TwoSumTwo {
    public static void main(String[] args) {

        int[] numbers = { 3, 24, 50, 79, 88, 150, 345 };
        twoSum(numbers, 200);

    }

    // public static int[] twoSum(int[] numbers, int target) {

    // int[] result = new int[2];

    // if (numbers.length > 10) {

    // int index = numbers.length / 2;
    // int temp = numbers[index] + numbers[index + 1];

    // if (temp > target) {
    // // temp big -> index decrese from middle

    // for (int i = 0; i < index; i++) {

    // for (int j = i + 1; j < index; j++) {

    // if ((numbers[i] + numbers[j]) == target) {
    // result[0] = i + 1;
    // result[1] = j + 1;

    // }
    // }

    // }

    // } else {
    // // temp small -> index increase from middle
    // for (int i = index; i < numbers.length - 1; i++) {

    // for (int j = index + 1; j < numbers.length; j++) {

    // if ((numbers[i] + numbers[j]) == target) {
    // result[0] = i + 1;
    // result[1] = j + 1;
    // }
    // }

    // }

    // }

    // } else {
    // for (int i = 0; i < numbers.length; i++) {

    // for (int j = i + 1; j < numbers.length; j++) {

    // if ((numbers[i] + numbers[j]) == target) {
    // result[0] = i + 1;
    // result[1] = j + 1;
    // }
    // }

    // }
    // }

    // System.out.println(result[0]);
    // System.out.println(result[1]);

    // return result;

    // }

    public static int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];

        int p1;
        int p2 = numbers.length - 1;

        for (p1 = 0; p1 < numbers.length;) {

            int res = numbers[p1] + numbers[p2];

            // System.out.println("summation "+res+"target "+target);

            if (res == target) {
                // System.out.println("result : ");
                result[0] = p1 + 1;
                result[1] = p2 + 1;

                break;
            }

            if (res > target) {
                p2--;
                // System.out.println("p2");
            } else {
                p1++;
                // System.out.println("p1");
            }

        }

        System.out.println(result[0]);
        System.out.println(result[1]);

        return result;

    }

}
