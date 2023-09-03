package tarefa04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaPedidos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Pedido> pedidos = new ArrayList<>();

    System.out.println("Informe qual ação deseja realizar: ");
    System.out.println("1 - Incluir Pedido.");
    System.out.println("2 - Excluir pedido por nome do cliente.");
    System.out.println("3 - Listar Pedidos.");
    System.out.println("4 - Incluir Item de Pedido em Pedido.");
    System.out.println("5 - Excluir item de Pedido em Pedido.");
    System.out.println("6 - Imprimir a lista de Pedidos.");
    int op = sc.nextInt();

    switch (op) {
      case 1:
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        break;
      case 6:
        break;
    }

    sc.close();
  }

  public void incluirPedido(String nomeCliente, double valorTotalPermitido, List<Pedido> pedidos) {
    pedidos.add(new Pedido(nomeCliente, valorTotalPermitido));
  }


}
