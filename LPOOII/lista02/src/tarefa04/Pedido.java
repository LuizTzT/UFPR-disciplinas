package tarefa04;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

  private String nomeCliente;
  private double valorTotalPermitido;
  List<ItemDePedido> itens = new ArrayList<>();

  public Pedido(String nomeCliente, double valorTotalPermitido) {
    this.nomeCliente = nomeCliente;
    this.valorTotalPermitido = valorTotalPermitido;
  }

  public String getCliente() {
    return nomeCliente;
  }

  public List<ItemDePedido> getItens() {
    return itens;
  }

  public double getTotal() {
    double somaTotal = 0.0;
    for (ItemDePedido item : itens) {
      somaTotal += item.getPreco() * item.getQuantidade();
    }
    return somaTotal;
  }

 
}
