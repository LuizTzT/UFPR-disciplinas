package tarefa01;
import java.util.Scanner;

public class Shapes {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a área que deseja calcular: \nR - Retângulo\nC - Circunferência\nT - Triângulo");
    char op = sc.next().toUpperCase().charAt(0);

    while (op != 'R' && op != 'C' && op != 'T') {
      System.out.println("Informe uma opção válida R / C / T : ");
      op = sc.next().toUpperCase().charAt(0);
    }

    switch (op) {
      case 'R':
        System.out.println("Informe os dois lados do retângulo um em cada linha: ");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        System.out.printf("A área do retângulo é: %.1f", calculaAreaRetangulo(lado1, lado2));
        break;

      case 'C':
        System.out.println("Informe o raio da circunferência: ");
        double raio = sc.nextDouble();
        System.out.printf("A área do triângulo é %.1f", calculaAreaCircunferencia(raio));
        break;

      case 'T':
        System.out.println("Informe a base a a altura do triângulo um em cada linha: ");
        double base = sc.nextDouble();
        double altura = sc.nextDouble();
        System.out.printf("A área do triângulo é %.1f", calculaAreaTriangulo(base, altura));
        break;
    }
    sc.close();
  }

  public static final double PI = 3.14159;

  private static void verificaParametrosNegativos(double... valores) {
    for (double valor : valores) {
      if (valor < 0) {
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
