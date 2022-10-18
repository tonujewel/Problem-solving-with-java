import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {
  public static void main(String[] args) {
    int number = 100;
    decimalToBinary(number);
  }

  static void decimalToBinary(int number) {

    List<Integer> data = new ArrayList<>();

    int index=0;

    while (number > 0) {
      
      data.add(number%2);
      number = number / 2;
      index++;

    }

    List<Integer> result = new ArrayList<>();

    for (int j = index - 1; j >= 0; j--) {
      result.add(data.get(j));

    }
             
    System.out.println("result" + result);

  }

}
