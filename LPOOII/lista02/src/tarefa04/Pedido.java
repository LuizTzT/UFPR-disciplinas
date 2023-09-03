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


}
