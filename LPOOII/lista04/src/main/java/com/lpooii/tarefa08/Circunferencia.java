package com.lpooii.tarefa08;

public class Circunferencia implements Superficie{
  private double raio;

  public Circunferencia(double raio) {
    this.raio = raio;
  }

  public double area(){
    return Math.PI * Math.pow(raio, 2);
  }
}
