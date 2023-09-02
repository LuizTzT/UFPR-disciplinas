public class Circunferencia {

  private double raio;

  public Circunferencia(double raio) {
    Validation.validarParametros(raio, "O raio informado é negativo!");
    this.raio = raio;
  }

  public double area() {
    return Math.PI * Math.pow(raio, 2);
  }

  public double getRaio() {
    return raio;
  }
}
