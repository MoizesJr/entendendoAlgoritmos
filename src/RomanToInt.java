public class RomanToInt {

  public static int romanoParaInteiro(String s) {
    int resultado = 0;
    int valorAnterior = 0;

    for (int i = s.length() - 1; i >= 0; i--) {
      char c = s.charAt(i);
      int valorAtual = valorRomano(c);

      if (valorAtual < valorAnterior) {
        resultado -= valorAtual;
      } else {
        resultado += valorAtual;
      }

      valorAnterior = valorAtual;
    }

    return resultado;
  }

  // Função auxiliar para obter o valor do numeral romano
  public static int valorRomano(char c) {
    return switch (c) {
      case 'I' -> 1;
      case 'V' -> 5;
      case 'X' -> 10;
      case 'L' -> 50;
      case 'C' -> 100;
      case 'D' -> 500;
      case 'M' -> 1000;
      default -> 0;
    }; // Ou lançar uma exceção se quiser validar
  }

  public static void main(String[] args) {
    String numeroRomano = "XL";
    int inteiro = romanoParaInteiro(numeroRomano);
    System.out.println("O número romano " + numeroRomano + " é igual a " + inteiro);
  }
}
