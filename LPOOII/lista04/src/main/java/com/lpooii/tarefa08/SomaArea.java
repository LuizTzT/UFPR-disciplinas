package com.lpooii.tarefa08;

public class SomaArea {
  public double calculaArea(Superficie[] superficie){
    double somaAreas = 0.0;
    for(Superficie sp: superficie){
      somaAreas += sp.area();
    }
    return somaAreas;
  }
}
