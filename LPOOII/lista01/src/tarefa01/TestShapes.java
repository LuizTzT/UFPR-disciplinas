package tarefa01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class TestShapes {

  @Test
  public void testRetangulo1() {
    assertEquals(12, Shapes.calculaAreaRetangulo(3, 4), 0.001);
  }

  @Test
  public void testRetangulo2() {
    assertEquals(28, Shapes.calculaAreaRetangulo(7, 4), 0.001);
  }

  @Test
  public void testRetangulo3() {
    RuntimeException exception = assertThrows(RuntimeException.class, () -> {
      Shapes.calculaAreaRetangulo(-7, 4);
    });

    assertEquals("Parâmetros não podem ser negativos!", exception.getMessage());
  }

  @Test
  public void testCircunferencia1() {
    double areaEsperada = Math.PI * Math.pow(5, 2);
    assertEquals(areaEsperada, Shapes.calculaAreaCircunferencia(5), 0.001);
  }

  @Test
  public void testCircunferencia2() {
    double areaEsperada = Math.PI * Math.pow(10, 2);
    assertEquals(areaEsperada, Shapes.calculaAreaCircunferencia(10), 0.001);
  }

  @Test
  public void testCircunferencia3() {
    RuntimeException exception = assertThrows(RuntimeException.class, () -> {
      Shapes.calculaAreaCircunferencia(-6);
    });

    assertEquals("Parâmetros não podem ser negativos!", exception.getMessage());
  }

  @Test
  public void testTriangulo1() {
    assertEquals(12, Shapes.calculaAreaTriangulo(6, 4), 0.001);
  }

  @Test
  public void testTriangulo2() {
    assertEquals(150, Shapes.calculaAreaTriangulo(15, 20), 0.001);
  }

  @Test
  public void testTriangulo3() {
    RuntimeException exception = assertThrows(RuntimeException.class, () -> {
      Shapes.calculaAreaTriangulo(15, -20);
    });

    assertEquals("Parâmetros não podem ser negativos!", exception.getMessage());
  }
}
