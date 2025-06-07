import java.util.Arrays;

public class ExeSelectionSort2 {

  public static void sortMatriz(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[i]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 2, 6, 9, 1, 10, 8 };
    sortMatriz(arr);
    System.out.println(Arrays.toString(arr));
  }
}
