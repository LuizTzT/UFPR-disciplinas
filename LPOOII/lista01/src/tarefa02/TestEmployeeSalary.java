package tarefa02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEmployeeSalary {
  // método estático para receber os parâmetros do usuário
  // calcular o salário bruto
  // calcular o salário líquido

  // imprimir o resultado na tela formatado da seguinte maneira:
  // Extrato de salário
  // Valor Hora: R$ XXX,XX
  // Horas trabalhadas: XXX horas
  // Salário Bruto: R$ XXX,XX
  // Salário Líquido: R$ XXX,XX

  @Test
  public void testReceberParametros() {
  }

  @Test
  public void testSalarioBruto() {
    assertEquals(2.640, EmployeeSalary.salarioBruto(15, 176), 0.001);
  }

  @Test
  public void testSalarioLiquido(){
    assertEquals(2.323, EmployeeSalary.salarioLiquido(15, 176, 12), 0.001);
  }

  @Test
  public void testImpressaoResultado(){

  }
}
