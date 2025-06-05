import java.util.Scanner;

public class ExeRomanToInt {

  public int romanoInt(String s) {
    int result = 0; // resultado alg. romano
    int valuePrevious = 0; // manter a regra de sub / adição

    for (int i = s.length() - 1; i >= 0; i--) {
      char c = s.charAt(i);
      int valuePresent = valueRoman(c);

      if (valuePresent < valuePrevious) {
        result -= valuePresent;
      } else {
        result += valuePresent;
      }
      valuePrevious = valuePresent;
    }
    return result;
  }

  public int valueRoman(char c) {
    return switch (c) {
      case 'I' -> 1;
      case 'V' -> 5;
      case 'X' -> 10;
      case 'L' -> 50;
      case 'C' -> 100;
      case 'D' -> 500;
      case 'M' -> 1000;
      default -> 0;
    };
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe um algarismo romano: ");
    String roman = sc.nextLine();

    int romanTo = new ExeRomanToInt().romanoInt(roman);
    System.out.println("O numero romano " + roman + " é igual a " + romanTo);
  }
}
