public class Handshake {

    public static void main(String[] args) {

        handshake(8);

    }

    public static int handshake(int n) {

        // Write your code here

        if (n == 0) {
            return 0;
        }

        int person = 1;

        int temp = 0;

        for (int i = 0; i < n; i++) {
            person++;
            temp = ((temp - 1) + (person - 1));
        }

        return temp;
    }

}
