## Lista de exercícios 1 LPOO

### 1. Implemente e entenda os exemplos da aula;

### 2. (Tarefa 1) Construa uma classe com três métodos estáticos:
- a. public static double calculaAreaRetangulo(double lado1, double
lado2)
- b. public static double calculaAreaCircunferencia(double raio)
- c. public static double calculaAreaTriangulo(double base, double altura).

- Se qualquer método receber parâmetros negativos, deve-se levantar a exceção RuntimeException.
- Antes da criação da classe, crie uma classe de teste unitário, com pelo menos dois testes para cada método.
- No método main dessa classe crie uma estrutura para obter os parâmetro do
teclado (com opção para o usuário escolher qual área quer calcular).

### 3. (Tarefa 2) Escreva um programa para efetuar o cálculo do salário bruto e do salário líquido de um empregado. Os dados fornecidos são:
- O valor do salário hora
- O número de horas trabalhadas no mês
- O percentual de desconto do INSS

- Utilize exceções para validar as entradas de dados.
- Antes da criação da classe, crie uma classe de teste unitário, com pelo menos dois testes para cada método.
- Crie um método estático para receber os parâmetros do usuário, outro para calcular o salário bruto, outro para calcular o salário líquido e outro para imprimir o resultado na tela formatado da seguinte maneira:

  Extrato de salário

  Valor Hora: R$ XXX,XX

  Horas trabalhadas: XXX horas

  Salário Bruto: R$ XXX,XX

  Salário Líquido: R$ XXX,XX