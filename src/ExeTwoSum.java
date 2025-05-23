
import java.util.Arrays;

public class ExeTwoSum {

  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {
    int[] numbers = { 2, 7, 6, 8, 9, 10, 15, 19, 35, 40 };
    int[] result = new ExeTwoSum().twoSum(numbers, 47);
    System.out.println(Arrays.toString(result));
  }
}
