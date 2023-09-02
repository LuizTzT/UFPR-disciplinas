public class Triangulo {
  private double base;
  private double altura;

  public Triangulo(double base, double altura) {
    Validation.validarParametros(base, "A base do triângulo informada é negativa!");
    Validation.validarParametros(altura, "A altura triângulo informada é negativa!");
    this.base = base;
    this.altura = altura;
  }

  public double area() {
    return (base * altura) / 2;
  }

  public double getBase() {
    return base;
  }

  public double getAltura() {
    return altura;
  }

}
