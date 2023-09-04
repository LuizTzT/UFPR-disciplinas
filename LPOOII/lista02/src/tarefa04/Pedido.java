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

  public void acrescentaItem(ItemDePedido item) {
    try {

      if (item == null) {
        throw new ItemExceptions("Item nulo.");
      } else if (getTotal() > valorTotalPermitido || item.getPreco() * item.getQuantidade() > valorTotalPermitido) {
        throw new ItemExceptions("Item de Pedido não incluído. Valor de pedido excedido.");
      } else if (valorTotalPermitido == 0) {
        throw new ItemExceptions("Cliente não tem nenhum crédito");
      } else {

        boolean itemEncontrado = false;
        for (ItemDePedido itemLista : itens) {
          if (itemLista.getNome().equals(item.getNome())) {
            itemEncontrado = true;
            itemLista.setQuantidade(itemLista.getQuantidade() + item.getQuantidade());
            return;
          }
        }

        if (!itemEncontrado) {
          itens.add(item);
        }
      }

    } catch (ItemExceptions e) {
      System.out.println(e.getMessage());
    }
  }

  public void retiraItem(ItemDePedido item) {
    boolean itemEncontrado = false;

    try {
      for (ItemDePedido itemLista : itens) {
        if (itemLista.getNome().equals(item.getNome())) {
          itemEncontrado = true;
          if (itemLista.getQuantidade() == 1) {
            itens.remove(itemLista);
          } else {
            itemLista.setQuantidade(itemLista.getQuantidade() - item.getQuantidade());
          }
          break;
        }
      }

      if (!itemEncontrado) {
        throw new ItemExceptions("Item não encontrado no pedido.");
      }
    } catch (ItemExceptions e) {
      System.out.println(e.getMessage());
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("------------------------------").append("\n");
    sb.append("Nome do Cliente: ").append(nomeCliente).append("\n");
    sb.append(String.format("Total do pedido: R$%.2f", getTotal())).append("\n");
    sb.append(String.format("%-20s | %s", "Item", "Preço")).append("\n");

    for (ItemDePedido item : itens) {
      sb.append(String.format("%-20s", item.getNome())).append(" | R$").append(String.format("%.2f",item.getPreco())).append("\n");
    }

    sb.append("------------------------------").append("\n");
    return sb.toString();
  }

}
