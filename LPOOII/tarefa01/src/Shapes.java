public class Shapes {

  public static void main(String[] args) throws Exception {

  }

  public static final double PI = 3.14159;

  private static void verificaParametrosNegativos(double... valores){
    for(double valor : valores){
      if (valor < 0){
        throw new RuntimeException("Parâmetros não podem ser negativos!");
      }
    }
  }

  public static double calculaAreaRetangulo(double lado1, double lado2) {
    verificaParametrosNegativos(lado1, lado2);
    return lado1 * lado2;
  }

  public static double calculaAreaCircunferencia(double raio) {
    verificaParametrosNegativos(raio);
    return 2 * PI * raio;
  }

  public static double calculaAreaTriangulo(double base, double altura) {
    verificaParametrosNegativos(base, altura);
    return (base * altura) / 2;
  }
}
