public class ValidPalindrome {
    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome(String s) {

        String data = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        String data2 ="";

        for(int i=data.length()-1;i>=0;i--){
             data2= data2+data.charAt(i);
        }

        System.out.println(data2);

        if(data.equals(data2)){
            return true;
        }else{
            return false;
        }
        
    }
}
