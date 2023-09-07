package com.lpooii.tarefa07;

public class Pilha<T> {
  private Object[] elementos;
  private int tamanho;
  private static final int TAMANHO_INICIAL = 10;

  public Pilha() {
    elementos = new Object[TAMANHO_INICIAL];
    tamanho = 0;
  }

  public void empilha(T elemento) {
    if (tamanho == elementos.length) {
      redimensionar();
    }

    elementos[tamanho] = elemento;
    tamanho++;
  }

  public void desempilha() {
    if (pilhaVazia()) {
      throw new IllegalStateException("A pilha está vazia");
    }

    // T elemento = (T) elementos[tamanho-1];
    elementos[tamanho - 1] = null;
    tamanho--;
  }

  public boolean pilhaVazia() {
    return tamanho == 0;
  }


  private void redimensionar() {
    int novoTamanho = elementos.length * 2;
    Object[] novoArray = new Object[novoTamanho];
    System.arraycopy(elementos, 0, novoArray, 0, tamanho);
    elementos = novoArray;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[ ");
    for (int i = tamanho - 1; i >= 0; i--) {
      sb.append(elementos[i]);

      if (i > 0) {
        sb.append(" , ");
      }
    }

    sb.append(" ]");

    return sb.toString();
  }
}
