public class PowerCalculation {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
       System.out.println( findPower(a, b));
    }

    static int findPower(int a, int n) {
        int result = 1; 
        for (int i = 0; i < n; i++) {
            result = result*a;
        }
       return result;

    }
}
