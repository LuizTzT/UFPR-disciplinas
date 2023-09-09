package com.lpooii.tarefa10;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Calculos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe a distância percorrida em Km: ");
    double distanciaPercorrida = sc.nextDouble();

    System.out.print("Informe o tempo gasto em horas: ");
    double tempoGasto = sc.nextDouble();

    BigDecimal distancia = new BigDecimal(distanciaPercorrida);
    BigDecimal tempo = new BigDecimal(tempoGasto);

    distancia.setScale(3, RoundingMode.UP);
    tempo.setScale(3, RoundingMode.UP);

    System.out.printf("Velocidade média: %s", velocidadeMedia(distancia, tempo));

    sc.close();
  }

  public static BigDecimal velocidadeMedia(BigDecimal distancia, BigDecimal tempo) {

    if (tempo.compareTo(BigDecimal.ZERO) == 0) {
      throw new ArithmeticException("Divisão por zero não é permitida");
    }

    BigDecimal resultado = distancia.divide(tempo, 2, RoundingMode.HALF_UP);

    return resultado;
  }

}
