
public class ExeBinary {

  public int binary(int[] numbers, int item) {
    int low = 0;
    int high = numbers.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      int guess = numbers[mid];

      if (guess == item) {
        return mid;
      }
      if (guess > item) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] myList = { 1, 3, 7, 9, 15, 26, 35, 69 };

    int done = new ExeBinary().binary(myList, 35);
    System.out.println(done);
  }

}
