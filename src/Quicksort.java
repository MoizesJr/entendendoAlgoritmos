import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quicksort {

  public static void main(String[] args) {
    System.out.println(quicksort(Arrays.asList(10, 5, 2, 3)));
  }

  private static List<Integer> quicksort(List<Integer> list) {
    if (list.size() < 2) {
      // caso base, arrays com 0 ou 1 elemento
      return list;
    } else {
      // caso recursivo
      Integer pivot = list.get(0);

      // sub-array dos elementos menores que o pivô
      List<Integer> less = list.stream().skip(1).filter(el -> el <= pivot)
          .collect(Collectors.toList());

      // sub-matriz dos elementos maiores que o pivô
      List<Integer> greater = list.stream().skip(1).filter(el -> el > pivot)
          .collect(Collectors.toList());

      return Stream.of(
          quicksort(less).stream(),
          Stream.of(pivot),
          quicksort(greater).stream())
          .flatMap(Function.identity()).collect(Collectors.toList());
    }
  }

}
