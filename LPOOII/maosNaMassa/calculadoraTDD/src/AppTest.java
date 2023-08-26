import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class AppTest {

  @Test
  public void testSoma1() {
    double a = 3;
    double b = 5;
    assertEquals(8, App.soma(a, b), 0.001);
  }

  @Test
  public void testSoma2() {
    double a = 2;
    double b = 5;
    assertEquals(7, App.soma(a, b), 0.001);
  }

  @Test
  public void testSoma3() {
    double a = -3.5;
    double b = 5;
    assertEquals(1.5, App.soma(a, b), 0.001);
  }

  @Test
  public void testDivisao1() {
    double a = 6;
    double b = 5;
    assertEquals(1.2, App.divisao(a, b), 0.001);
  }

  @Test
  public void testDivisao2() {
    double a = 6;
    double b = 0;
    assertEquals(Double.POSITIVE_INFINITY, App.divisao(a, b), 0.001);
  }

  @Test
  public void testeCalcula1() {
    double a = 3;
    double b = 5;
    assertEquals(8, App.calcula(a, b, "+"), 0.001);
  }

  @Test
  public void testeCalcula2() {
    double a = 3;
    double b = 5;
    RuntimeException exception = assertThrows(RuntimeException.class, () -> {
      App.calcula(a, b, "?");
    });

    assertEquals("Operação não implementada", exception.getMessage());
  }

}
