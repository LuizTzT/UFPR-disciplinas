package tarefa02;

import java.util.Scanner;

public class EmployeeSalary {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.print("Valor do sálario hora: ");
    double salarioHora = sc.nextDouble();

    System.out.print("Horas trabalhadas: ");
    int horasTrabalhadas = sc.nextInt();

    System.out.print("Desconto do INSS: ");
    double descontoINSS = sc.nextDouble();

    receberParametros(salarioHora, horasTrabalhadas, descontoINSS);

    sc.close();
  }

  public static void receberParametros(double salarioHora, int horasTrabalhadas, double descontoINSS) {
    double salarioBruto = salarioBruto(salarioHora, horasTrabalhadas);
    double salarioLiquido = salarioLiquido(salarioHora, horasTrabalhadas, descontoINSS);
    imprimirResultado(salarioHora, horasTrabalhadas, salarioBruto, salarioLiquido);
  }

  public static double salarioBruto(double salarioHora, int horasTrabalhadas) {
    return salarioHora * horasTrabalhadas;
  }

  public static double salarioLiquido(double salarioHora, int horasTrabalhadas, double descontoINSS) {
    return salarioBruto(salarioHora, horasTrabalhadas) * (1 - descontoINSS / 100);
  }

  public static void imprimirResultado(double salarioHora, int horasTrabalhadas, double salarioBruto,
      double salarioLiquido) {
        System.out.println("\nExtrato de salário");
        System.out.printf("Valor hora: R$ %.2f\n", salarioHora);
        System.out.printf("Horas trabalhadas: %d horas.\n", horasTrabalhadas);
        System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);
  }
}