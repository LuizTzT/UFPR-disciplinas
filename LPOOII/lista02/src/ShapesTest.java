import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShapesTest {

  @Test
  public void testAreaRetangulo() {
    Retangulo retangulo1 = new Retangulo(5.0, 10.0);
    double areaEsperada1 = retangulo1.area();
    double areaAtual1 = 50.0;

    assertEquals(areaAtual1, areaEsperada1, 0.001);

    Retangulo retangulo2 = new Retangulo(7.0, 3.0);
    double areaEsperada2 = retangulo2.area();
    double areaAtual2 = 21.0;

    assertEquals(areaAtual2, areaEsperada2, 0.001);
  }

  @Test
  public void testPerimetroRetangulo() {
    Retangulo retangulo1 = new Retangulo(5.0, 10.0);
    double perimetroEsperado1 = retangulo1.perimetro();
    double perimetroAtual1 = (5.0 + 10.0) * 2;

    assertEquals(perimetroAtual1, perimetroEsperado1, 0.001);

    Retangulo retangulo2 = new Retangulo(5.0, 7.0);
    double perimetroAtual2 = retangulo2.perimetro();
    double perimetroEsperado2 = (5.0 + 7.0) * 2;

    assertEquals(perimetroAtual2, perimetroEsperado2, 0.001);
  }

  @Test
  public void testAreaCircunferencia() {
    Circunferencia circunferencia1 = new Circunferencia(15);
    double areaEsperada1 = circunferencia1.area();
    double areaAtual1 = Math.PI * Math.pow(15, 2);

    assertEquals(areaAtual1, areaEsperada1, 0.001);

    Circunferencia circunferencia2 = new Circunferencia(10);
    double areaEsperada2 = circunferencia2.area();
    double areaAtual2 = Math.PI * Math.pow(10, 2);

    assertEquals(areaAtual2, areaEsperada2, 0.001);
  }
}
