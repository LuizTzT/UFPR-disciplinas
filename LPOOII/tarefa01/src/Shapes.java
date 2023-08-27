public class Shapes {

  public static void main(String[] args) throws Exception {


  }

  public static final double PI = 3.14159;

  public static double calculaAreaRetangulo(double lado1, double lado2) {
    return lado1 * lado2;
  }

  public static double calculaAreaCircunferencia(double raio) {
    return 2 * PI * raio;
  }

  public static double calculaAreaTriangulo(double base, double altura) {
    return (base * altura) / 2;
  }
}
