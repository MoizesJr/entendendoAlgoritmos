public class Factorial {

  private static int fact(int x) {
    System.out.println(x);
    if (x == 1) {
      return 1;
    } else {
      return x * fact(x - 1);
    }
  }

  private static void countDonw(int i) {
    System.out.println(i);
    if (i <= 0) {
      return;
    } else {
      countDonw(i - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println(fact(3));
  }
}
