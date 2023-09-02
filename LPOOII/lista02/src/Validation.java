public class Validation {
  public static void validarParametros(double valor, String mensagem) {
    if (valor < 0)
      throw new RuntimeException(mensagem);
  }
}
