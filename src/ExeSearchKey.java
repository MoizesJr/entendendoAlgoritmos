import java.util.List;

public class ExeSearchKey {

  private String nome;
  private List<ExeSearchKey> conteudo;

  public ExeSearchKey(String nome) {
    this.nome = nome;
    this.conteudo = null;
  }

  public ExeSearchKey(List<ExeSearchKey> conteudo) {
    this.nome = "caixa";
    this.conteudo = conteudo;
  }

  public boolean box() {
    return conteudo != null;
  }

  public boolean key() {
    return "chave".equals(nome);
  }

  public static boolean searchKey(List<ExeSearchKey> itens) {
    for (ExeSearchKey search : itens) {
      if (search.box()) {
        if (searchKey(search.conteudo)) {
          return true;
        }
      } else if (search.key()) {
        System.out.println("Encontrei a chave");
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {

    ExeSearchKey caneta = new ExeSearchKey("caneta");
    ExeSearchKey lapis = new ExeSearchKey("lapis");
    ExeSearchKey subcaixa = new ExeSearchKey(List.of(lapis));
    ExeSearchKey caixaPrincipal = new ExeSearchKey(List.of(caneta, subcaixa));

    boolean achou = searchKey(List.of(caixaPrincipal));
    if (!achou)
      System.out.println("Chave não encontrada");
  }
}
