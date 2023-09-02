package tarefa03;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsaFormas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Triangulo> triangulos = new ArrayList<>();
    List<Retangulo> retangulos = new ArrayList<>();
    List<Circunferencia> circunferencias = new ArrayList<>();

    System.out.print("Informe a quantidade de formas que irá criar 0 para finalizar: ");
    int qtdFormas = sc.nextInt();

    while (qtdFormas != 0) {
      try {
        for (int i = 0; i < qtdFormas; i++) {
          System.out.print("Qual forma deseja criar C - Circunferência / R - Retângulo / T - Triângulo: ");
          char forma = sc.next().toUpperCase().charAt(0);

          switch (forma) {
            case 'C':
              System.out.print("Informe o raio da circunferência: ");
              double raio = sc.nextDouble();
              Circunferencia circunferencia = new Circunferencia(raio);
              circunferencias.add(circunferencia);
              break;
            case 'R':
              System.out.print("Informe a base e altura do retângulo separados por um espaço: ");
              double base = sc.nextDouble();
              double altura = sc.nextDouble();
              Retangulo retangulo = new Retangulo(base, altura);
              retangulos.add(retangulo);
              break;
            case 'T':
              System.out.print("Informe a base e altura do triângulo separados por um espaço: ");
              base = sc.nextDouble();
              altura = sc.nextDouble();
              Triangulo triangulo = new Triangulo(base, altura);
              triangulos.add(triangulo);
              break;
          }
        }
        System.out.print("Informe a quantidade de formas que irá criar 0 para finalizar: ");
        qtdFormas = sc.nextInt();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

    System.out.println("\nÁreas dos retângulos criados: ");
    for (Retangulo r : retangulos) {
      System.out.printf("Base: %.1f, Altura: %.1f, Área -> %.1f\n", r.getBase(), r.getAltura(), r.area());
      System.out.printf("Perímetro -> %.1f\n", r.perimetro());
    }

    System.out.println("\nÁreas dos triângulos criados: ");
    for (Triangulo t : triangulos) {
      System.out.printf("Base: %.1f, Altura: %.1f, Área -> %.1f\n", t.getBase(), t.getAltura(), t.area());
    }

    System.out.println("\nÁreas das circunferências criadas: ");
    for (Circunferencia c : circunferencias) {
      System.out.printf("Raio %.1f, Área -> %.1f\n", c.getRaio(), c.area());
    }

    sc.close();
  }
}
