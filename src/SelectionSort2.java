
import java.util.Arrays;

public class SelectionSort2 {

  public static void selectionSort2(int[] arr) {
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
    int arr[] = { 5, 3, 6, 2, 10 };
    selectionSort2(arr);
    System.out.println(Arrays.toString(arr));
  }
}
