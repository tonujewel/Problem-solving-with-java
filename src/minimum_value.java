
/**
 * minimum_value
 */
public class minimum_value {

    public static void main(String[] args) {
        int[] myNum = { 21, 6, 8, 20, 999 };

        int minimum = 1;

        for (int i = 0; i < myNum.length - 1; i++) {
            System.out.println(myNum[i]+" > "+myNum[i + 1]);
            if (myNum[i] > myNum[i + 1]) {
                minimum = myNum[i + 1];
            }
        }

        System.out.println("minimum number: " + minimum);
    }
}