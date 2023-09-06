## Lista de exercícios - JDBC
#### 1. (Não entregar) Implemente e entenda os exemplos da aula de hoje.

#### 2. (Tarefa 5) Crie uma classe que liste contatos inseridos na base dados, utilizando a ContatoDao
- a. Crie os métodos:
  - public void altera(Contato contato) -> altera o contato com base nos valores recebidos pelo id do contato.
  - public void remove(Contato contato) -> remove o contato com base no id recebido do contato.
  - public List<Contato> lista() -> retorna a lista de contatos 
  - public void insere(Contato contato) -> insere um contato com base no id recebido do contato

- b. Crie uma classe para testar os métodos.

#### 3. (Tarefa 6) Complete o exemplo Livro Autor:
- a. Quando é invocado o método inserirAutor, da classe AutorDAO, a aplicação está inserindo somente os dados de Autor na tabela Autor. Complete o código desta classe, criando os métodos necessários para que, na chamada deste método, a
aplicação faça o relacionamento dos livros que determinado autor escreveu.
- b. Implemente esta possibilidade (a) na opção 1 do menu. Quando o usuário desejar, também poderá informar ids de livros que determinado autor escreveu.
- c. Implemente a opção 5 do menu.
- d. Implemente a opção 6 do menu.
- e. Na opção 3 (método listarAutores) imprima a lista de autores em ordem alfabética.

Dicas:
- i. Estude a interface java.util.Comparator.e o método sort da classe java.util.Collections
- ii. Implemente esta interface em uma classe ComparadorAutor
- iii. Utilize o método sort da classe java.util.Collections para fazer a ordenação