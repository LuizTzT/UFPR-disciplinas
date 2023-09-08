package com.lpooii.tarefa09;

public class UsaBicicleta {
  public static void main(String[] args) {
    Bicicleta bicicletaAnonima = new Bicicleta(){
      @Override
      public void aplicarFreios(int decremento){
        velocidade = velocidade - 2 * decremento;
      }
    };
    Bicicleta bike = new Bicicleta();

    System.out.println("Anônima:");
    bicicletaAnonima.aumentarVelocidade(20);
    bicicletaAnonima.printStates();
    bicicletaAnonima.aplicarFreios(10);
    bicicletaAnonima.printStates();

    System.out.println();

    System.out.println("Comum:");
    bike.aumentarVelocidade(20);
    bike.printStates();
    bike.aplicarFreios(10);
    bike.printStates();
  }
}
