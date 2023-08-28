package tarefa02;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TestEmployeeSalary {

  @Test
  public void testReceberParametros1() {
    double salarioHora = 15;
    int horasTrabalhadas = 100;
    double descontoINSS = 12;

    double resultado = EmployeeSalary.salarioLiquido(salarioHora, horasTrabalhadas, descontoINSS);

    double salarioEsperado = (horasTrabalhadas * salarioHora) * (1 - descontoINSS / 100);
    assertEquals(salarioEsperado, resultado, 0.001);
  }

  @Test
  public void testReceberParametros2() {
    double salarioHora = 15;
    int horasTrabalhadas = 100;

    double resultado = EmployeeSalary.salarioBruto(salarioHora, horasTrabalhadas);

    double salarioEsperado = horasTrabalhadas * salarioHora;
    assertEquals(salarioEsperado, resultado, 0.001);
  }

  @Test
  public void testSalarioBruto1() {
    assertEquals(2640.0, EmployeeSalary.salarioBruto(15, 176), 0.001);
  }

  @Test
  public void testSalarioBruto2() {
    assertEquals(4500.0, EmployeeSalary.salarioBruto(30, 150), 0.001);
  }

  @Test
  public void testSalarioLiquido1() {
    assertEquals(2323.2, EmployeeSalary.salarioLiquido(15, 176, 12), 0.001);
  }

  @Test
  public void testSalarioLiquido2() {
    assertEquals(3960.0, EmployeeSalary.salarioLiquido(30, 150, 12), 0.001);
  }

  @Test
  public void testImprimirResultado1() {
    double salarioHora = 15.0;
    int horasTrabalhadas = 176;
    double salarioBruto = 2640.0;
    double salarioLiquido = 2323.2;

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    EmployeeSalary.imprimirResultado(salarioHora, horasTrabalhadas, salarioBruto, salarioLiquido);

    String resultadoEsperado = "Extrato de salário\n" +
        String.format("Valor hora: R$ %.2f\n", salarioHora) +
        String.format("Horas trabalhadas: %d horas.\n", horasTrabalhadas) +
        String.format("Salário Bruto: R$ %.2f\n", salarioBruto) +
        String.format("Salário Líquido: R$ %.2f", salarioLiquido);

    String resultadoCapturado = outputStream.toString().replaceAll("\r\n", "\n");

    assertEquals(resultadoEsperado, resultadoCapturado.trim());
  }

  @Test
  public void testImprimirResultado2() {
    double salarioHora = 30.0;
    int horasTrabalhadas = 150;
    double salarioBruto = 4500.0;
    double salarioLiquido = 3960.0;

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    EmployeeSalary.imprimirResultado(salarioHora, horasTrabalhadas, salarioBruto, salarioLiquido);

    String resultadoEsperado = "Extrato de salário\n" +
        String.format("Valor hora: R$ %.2f\n", salarioHora) +
        String.format("Horas trabalhadas: %d horas.\n", horasTrabalhadas) +
        String.format("Salário Bruto: R$ %.2f\n", salarioBruto) +
        String.format("Salário Líquido: R$ %.2f", salarioLiquido);

    String resultadoCapturado = outputStream.toString().replaceAll("\r\n", "\n");

    assertEquals(resultadoEsperado, resultadoCapturado.trim());
  }
}
