
import java.util.Arrays;

public class SearchPerson {

  public int searchPerson(String[] person, String target) {
    int low = 0;
    int high = person.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      int guess = person[mid].compareToIgnoreCase(target);

      if (guess == 0) {
        return mid;
      } else if (guess < 0) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    String[] names = { "Alanna", "Joao", "Moizes", "Liz", "Ivo", "Junior" };
    Arrays.sort(names);
    int result = new SearchPerson().searchPerson(names, "joao");

    if (result != -1) {
      System.out.println("Encontrado no índice: " + result);
    } else {
      System.out.println("Não encontrado.");
    }
    System.out.println(result);

    System.out.println(Arrays.toString(names));
    System.out.println(names.length - 1);
  }
}
