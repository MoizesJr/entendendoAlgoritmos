import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

  // função que vai remover os elementos da arr e adiciona no newArr a lista
  // ordenada
  private static List<Integer> selectionSort(List<Integer> arr) {
    List<Integer> newArr = new ArrayList<>(arr.size());

    int size = arr.size();
    for (int i = 0; i < size; i++) {
      int smallest = findSmallest(arr); // busca o menor elemento e adiciona em newArr
      newArr.add(arr.get(smallest));

      arr.remove(smallest);
    }
    return newArr;
  }

  // função para procurar o menor elemento e adicionar na newArr
  private static int findSmallest(List<Integer> arr) {
    int smallest = arr.get(0); // Armazena o menor valor
    int smallestIndex = 0; // Armazena o indice do menor valor

    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) < smallest) {
        smallest = arr.get(i);
        smallestIndex = i;
      }
    }
    return smallestIndex;
  }

  public static void main(String[] args) {

    List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
    System.out.println(selectionSort(arr));

  }
}
