## Lista de exercícios 2 LPOO

### 1. Implemente e entenda os exemplos da aula;
### 2. (Tarefa 3) Crie três classes: Circunferencia, Retangulo e Triangulo. Para cada classe crie os seus construtores, sendo:
- a. public Circunferencia(double raio)

- b. public Retangulo(double lado1, double lado2)
- c. public Triangulo(double base, double altura)
- Se qualquer construtor receber parâmetros negativos, deve-se levantar a exceção RuntimeException com uma mensagem específica para caso.
- Em cada classe crie o método área com a seguinte assinatura:
public double area()
- Para o Retangulo, incluir o método public double perimetro()
- Antes da criação da classe, crie uma classe de teste unitário, com pelo menos dois testes para cada classe e método.
- Criar uma outra classe UsaFormas, com um método main. 
  - Esse método deve ter um laço que colete informações sobre as formas que o usuário deseja criar. 
  - Antes de iniciar o laço, o usuário deve informar quantas formas deseja criar. 
  - Deve-se ter uma maneira de interromper o laço quando o usuário não desejar incluir mais valores. 
  -Depois de interrompido o laço o sistema deve imprimir as áreas de todas as formas.

### 3. (Tarefa 4) Crie um sistema de carrinho de compras com as seguintes classes:
- a. Escreva a estrutura de uma classe (atributos e métodos) para representar um ItemDePedido (nome(String), preço(double),
quantidade(int)). 
  - Crie o construtor com validação para preço negativo, descrição nula ou vazia e quantidade 0 ou negativa.
  - Crie os gets e sets (com as devidas validações).
- b. Crie uma classe Pedido com o nome do cliente(String) e uma lista de ItemDePedido (List<ItemDePedido>) como atributo. 
  - Crie o construtor passando o valor total permitido (double) e o nome do cliente(String). 
  - Para essa classe crie os métodos:
    - i. String getCliente(): retorna o nome do cliente
    - ii. List<ItemDePedido> getItens(): retorna a lista de Itens de Pedido.
    - iii. void acrescentaItem(ItemDePedido): acrescentar o Item de Pedido na lista. 
      - Não aceitar nulo nesse atributo e Levantar exceção nesse caso. 
      - Se o valor do Pedido foi excedido, lenvantar a exceção com a seguinte mensagem: “Item de Pedido não incluído. Valor do pedido excedido.” 
      - Se o valor total permitido para o pedido for 0, levantar a exceção: “Cliente não tem nenhum crédito.” Se o item já existir na lista, somar a sua quantidade.
    - iv. void retiraItem(String nome): Retira o item do pedido da lista. Se não encontrar, levantar a exceção “Item não
encontrado no pedido.” v. double getTotal(): retorna o total do pedido (soma dos preços dos Itens).
    - vi. String toString(): método que retorna uma String de forma legível para o pedido:
-----------------------------------

Nome do Cliente: Rafael

Total do Pedido: R$800,00

Item |Preço

TV LED 22 |R$590,00

Celular Ching-Ling |R$210,00

-----------------------------------
- c. Crie uma outra classe (SistemaPedidos) que utilize objetos do tipo Pedido. 
  - Nessa classe instancie uma lista de Pedidos que armazene os pedidos criados. 
  - Crie um menu com as seguintes opções: 
    - 1 – Incluir Pedido, 
    - 2 – Excluir pedido por nome do cliente, 
    - 3 – Listar Pedidos, 
    - 4 – Incluir Item de Pedido em Pedido, 
    - 5 – Excluir Item de Pedido em Pedido,
    - 6 – Imprimir a lista de Pedidos. Cada um destes itens do menu deve ter um método associado.