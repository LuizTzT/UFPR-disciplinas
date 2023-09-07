package com.lpooii.tarefa08;

public class Quadrado implements Superficie{
  private double lado;
  
  public Quadrado(double lado) {
    this.lado = lado;
  }

  public double area(){
    return lado * lado;
  }

}
