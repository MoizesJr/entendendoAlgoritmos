import java.util.List;

public class SearchKey {

  private String nome;
  private List<SearchKey> conteudo;

  public SearchKey(String nome) {
    this.nome = nome;
    this.conteudo = null;
  }

  public SearchKey(List<SearchKey> conteudo) {
    this.nome = "caixa";
    this.conteudo = conteudo;
  }

  public boolean box() {
    return conteudo != null;
  }

  public boolean key() {
    return "chave".equals(nome);
  }

  // função recursiva
  public static boolean searchKey(List<SearchKey> itens) {
    for (SearchKey item : itens) {
      if (item.box()) {
        if (searchKey(item.conteudo)) {
          return true;
        }
      } else if (item.key()) {
        System.out.println("Encontrei a chave");
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {

    SearchKey caneta = new SearchKey("caneta");
    SearchKey chave = new SearchKey("chave");
    SearchKey subcaixa = new SearchKey(List.of(chave));
    SearchKey caixaPrincipal = new SearchKey(List.of(caneta, subcaixa));

    boolean achou = searchKey(List.of(caixaPrincipal));
    if (!achou)
      System.out.println("Chave não encontrada");
  }

}
