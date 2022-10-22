public class CountingValleys {

    public static void main(String[] args) {

    countingValleys(8, "UDDDUDUU");

    }

    public static int countingValleys(int steps, String path) {
        int h = 0;
        int res = 0;
        for (int i = 0; i < steps; i++) {
            char s = path.charAt(i);
            if (s == 'U') {
                h++;
                if (h == 0) {
                    res++;
                }
            } else {
                h--;
            }
        }

        System.out.println(res);

        return res;

    }

}
