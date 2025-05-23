
import java.util.Arrays;

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          /*
           * TESTE COMPORTAMENTO dos elementos
           * / System.out.println(nums[i]);
           * System.out.println(nums[j]);
           * int sum = nums[i] + nums[j];
           * System.out.println(sum);
           */
          return new int[] { i, j };
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {
    int[] resultado = { 2, 7, 11, 15 };
    System.out.println(Arrays.toString(twoSum(resultado, 22)));
  }
}
