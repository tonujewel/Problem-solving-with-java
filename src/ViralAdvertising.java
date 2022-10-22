public class ViralAdvertising {

    public static void main(String[] args) {
        viralAdvertising(4);
    }

    public static int viralAdvertising(int n) {

        int result = 0;

        int liked=0;

        int people = 5;
        for (int i = 0; i < n; i++) {
            liked = people/2;
            people = liked*3;
            result = result+liked;  
        }
     
        return result;
    }

}
