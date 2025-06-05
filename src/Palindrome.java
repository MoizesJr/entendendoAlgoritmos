
public class Palindrome {

  public boolean isPalindrome(int number) {
    if (number < 0)
      return false;
    int origin = number;
    int inverted = 0;

    while (number > 0) {
      int rest = number % 10;
      inverted = inverted * 10 + rest;
      number /= 10;
    }
    if (origin == inverted) {
      System.out.println(origin + " É um palíndromo");
    } else {
      System.out.println(origin + " Não é um palíndromo");
    }
    return origin == inverted;
  }

  public static void main(String[] args) {
    System.out.println(new Palindrome().isPalindrome(001));
  }
}
