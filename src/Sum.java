import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {

  public static int sum(List<Integer> arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    return sum;
  }

  public static int countItens(List<Integer> item) {
    // caso base
    if (item.isEmpty()) {
      return 0;
      // recursão
    } else {
      List<Integer> countSize = item.subList(1, item.size());
      return 1 + countItens(countSize);
    }
  }

  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 6, 8));
    System.out.println(sum(arr));
    System.out.println(countItens(arr));
  }
}
