public class Greet {

  private String name;

  public Greet(String name) {
    this.name = name;
  }

  private void greet2(String name) {
    System.out.println("how are you " + name + "?");
  }

  private void bye() {
    System.out.println("Bye!");
  }

  private void greet(String name) {
    System.out.println("Hello, " + name + "!");
    greet2(name);
    System.out.println("Getting ready to say bye...");
    bye();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    Greet test = new Greet("Moizés");
    test.greet(test.getName());
  }

}