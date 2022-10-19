public class PalidromeNumber {
    public static void main(String[] args) {
       System.out.println(isPalindrome(121)); ;
    }

    public static boolean isPalindrome(int x) {
        boolean res = false;

        String a = String.valueOf(x);

        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }

        if (a.equalsIgnoreCase(b)) {
            res = true;
        } else {
            res = false;
        }
        return res;

    }
}
