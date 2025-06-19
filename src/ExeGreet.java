public class ExeGreet {

  private String name;

  public ExeGreet(String name) {
    this.name = name;
  }

  public String greet2(String name) {
    return "How are you " + name + "?";
  }

  public void bye() {
    System.out.println("Bye!");
  }

  public void greet(String name) {
    System.out.println("Hello, " + name);
    greet2(name);
    System.out.println("getting ready to say goodbye...");
    bye();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    ExeGreet test = new ExeGreet("Moizés Júnior");
    test.greet(test.getName());
  }

}
