package tarefa03;
public class Retangulo {
  private double base;
  private double altura;

  public Retangulo(double base, double altura) {
    Validation.validarParametros(base, "A base do retângulo informada é negativa!");
    Validation.validarParametros(altura, "A altura do retângulo informada é negativa!");
    this.base = base;
    this.altura = altura;
  }

  public double area(){
    return base * altura;
  }

  public double perimetro(){
    return (base + altura) * 2;
  }

  public double getBase() {
    return base;
  }

  public double getAltura() {
    return altura;
  }
  
}
