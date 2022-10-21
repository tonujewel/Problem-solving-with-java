public class FizzBuzz {
    public static void main(String[] args) {

        fizzBuzz(3);
    }

    public static String[] fizzBuzz(int A) {

        String[] data = new String[A];

        for (int i = 0; i < A; i++) {

            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                System.out.println("res 1" + i);
                data[i] = "FizzBuzz";
            } else if ((i + 1) % 3 == 0) {
                System.out.println("res 2" + i);
                data[i] = "Fizz";
            } else if ((i + 1) % 5 == 0) {
                System.out.println("res 3" + i);
                data[i] = "Buzz";
            } else {
                System.out.println("res 4" + i);
                data[i] = i + 1 + "";
            }
        }

        for (int i = 0; i < data.length; i++) {

            System.out.print(data[i] + " ");

        }
        return data;
    }

}
