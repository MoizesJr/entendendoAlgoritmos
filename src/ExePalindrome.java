public class ExePalindrome {

  public boolean exePalindrome(int x) {
    if (x < 0)
      return false;
    int searchPalidrome = x;
    int numberInverted = 0; // inverte posição dos numeros

    while (x > 0) {
      int restNumber = x % 10;
      numberInverted = numberInverted * 10 + restNumber;
      x /= 10;
    }
    if (searchPalidrome == numberInverted) {
      System.out.println(searchPalidrome + " é palíndrome");
    } else {
      System.out.println(searchPalidrome + " não é palíndrome");
    }
    return searchPalidrome == numberInverted;
  }

  public static void main(String[] args) {
    System.out.println(new ExePalindrome().exePalindrome(223));
  }
}
