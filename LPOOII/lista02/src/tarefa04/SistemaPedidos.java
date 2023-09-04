package tarefa04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaPedidos {
  public static void main(String[] args) {
    List<Pedido> pedidos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    boolean teste = true;
    while (teste) {

      System.out.println("Informe qual ação deseja realizar: ");
      System.out.println("1 - Incluir Pedido.");
      System.out.println("2 - Excluir pedido por nome do cliente.");
      System.out.println("3 - Listar Pedidos.");
      System.out.println("4 - Incluir Item de Pedido em Pedido.");
      System.out.println("5 - Excluir item de Pedido em Pedido.");
      System.out.println("6 - Imprimir a lista de Pedidos.");
      System.out.println("0 - Encerrar.");
      int op = sc.nextInt();

      switch (op) {
        case 0:
          teste = false;
          break;
        case 1:
          System.out.print("Informe o nome do cliente: ");
          sc.nextLine();
          String nomeCliente = sc.nextLine();

          System.out.print("Informe a quantia total do cliente: ");
          double creditos = sc.nextDouble();

          incluirPedido(nomeCliente, creditos, pedidos);
          break;
        case 2:
          System.out.print("Informe o nome do Cliente que deseja excluir o pedido: ");
          sc.nextLine();
          nomeCliente = sc.nextLine();

          excluirPedido(nomeCliente, pedidos);
          break;
        case 3:
          System.out.print("Informe o nome do Cliente que deseja listar os pedidos: ");
          sc.nextLine();
          nomeCliente = sc.nextLine();

          listarPedidos(nomeCliente, pedidos);
          break;
        case 4:
          System.out.print("Informe o nome do cliente: ");
          sc.nextLine();
          nomeCliente = sc.nextLine();

          System.out.print("Qual item deseja adicionar: ");
          String nomeItem = sc.nextLine();

          System.out.print("Qual o valor desse item: ");
          double preco = sc.nextDouble();

          System.out.print("Qual a quantidade que será adicionada: ");
          int quantidade = sc.nextInt();

          ItemDePedido item = new ItemDePedido(nomeItem, preco, quantidade);
          incluirItemDePedido(nomeCliente, item, pedidos);
          break;
        case 5:
          break;
        case 6:
          break;
      }

    }
    sc.close();
  }

  public static void incluirPedido(String nomeCliente, double valorTotalPermitido, List<Pedido> pedidos) {
    pedidos.add(new Pedido(nomeCliente, valorTotalPermitido));
  }

  public static void excluirPedido(String nomeCliente, List<Pedido> pedidos) {
    boolean itemEncontrado = false;

    try {
      for (Pedido item : pedidos) {
        if (item.getCliente().equals(nomeCliente)) {
          pedidos.remove(item);
          System.out.printf("Pedido do cliente %s excluido com sucesso.\n", nomeCliente);
          itemEncontrado = true;
          return;
        }
      }

      if (!itemEncontrado) {
        throw new ItemExceptions("Nenhum pedido no nome desse cliente foi encontrado.");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void listarPedidos(String nomeCliente, List<Pedido> pedidos) {

    for (Pedido pedido : pedidos) {
      if (pedido.getCliente().equals(nomeCliente)) {
        System.out.println(pedido);
        return;
      }

    }
    System.out.println("Cliente não localizado");
  }

  public static void incluirItemDePedido(String nomeCliente, ItemDePedido item, List<Pedido> pedidos) {
    for (Pedido pedido : pedidos) {
      if (pedido.getCliente().equals(nomeCliente)) {
        pedido.acrescentaItem(item);
        return;
      }
    }
    System.out.println("Cliente não encontrado.");
  }

  // for (Pedido item : pedidos) {
  // System.out.println(item);
  // }
}
