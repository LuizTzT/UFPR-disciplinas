### (Tarefa 7) Construir uma classe genérica de pilha (nome: Pilha) sem usar nenhuma classe de Collection.

- Use o first-in – last-out (FILO). 
- Sobrescreva o método toString() para que imprima a lista no seguinte formato:

      [ Elemento01 , Elemento02 , Elemento03 ]

A seguinte classe deve ser utilizada para testar a sua pilha:

```java
public class UsaPilha {
public static void main(String[] args) throws Exception{
 Pilha <Integer> p1 = new Pilha <Integer>();
 p1.empilha(10);
 p1.empilha(20);
 p1.empilha(30);
 System.out.println(p1.toString());
 p1.desempilha();
 p1.desempilha();
 System.out.println(p1.toString());
 Pilha <String> p2 = new Pilha <String>();
 p2.empilha("Isto");
 p2.empilha("é");
 p2.empilha("uma");
 p2.empilha("pilha");
 p2.empilha("FILO");
 System.out.println(p2.toString());
 p2.desempilha();
 p2.desempilha();
 p2.desempilha();
 System.out.println(p2.toString());
}
}
```

O seguinte resultado deve ser apresentado para a execução acima:

    [ 30 , 20 , 10 ]
    [ 10 ]
    [ FILO , pilha , uma , é , Isto ]
    [ é , Isto ]


---
### (Tarefa 8) Defina uma classe (nome: SomaArea) que contenha um método genérico capaz de efetuar a soma das áreas de arrays contendo apenas objetos do tipo Quadrado ou Circunferência. 

- As classes Quadrado e Circunferência devem implementar a interface Superficie.

```java

public interface Superficie {
      public double area();
}
```

- A seguinte classe deve ser utilizada para testar a classe implementada:

```java
public class UsaSomaArea {
public static void main(String[] args) {
 Quadrado quad[] = {new Quadrado(2.0), new Quadrado(5.0)};
 Circunferencia circ[] = {new Circunferencia(3.0), new
 Circunferencia(2.0)};
 Superficie superf[] = new Superficie[quad.length + circ.length];
 superf[0] = quad[0];
 superf[1] = quad[1];
 superf[2] = circ[0];
 superf[3] = circ[1];
 SomaAreas soma = new SomaAreas();
 System.out.println("Area dos quadradados = " + soma.calculaArea(quad));
 System.out.println("Area das circunferencias = " +
 soma.calculaArea(circ));
 System.out.println("Soma de todas as áreas = " +
 soma.calculaArea(superf));
 }
}
```

- O seguinte resultado será apresentado:

      Area dos quadradados = 29.0
      Area das circunferencias = 40.840704496667314
      Soma de todas as áreas = 69.84070449666731

- Agora, pense na mesma solução sem utilizar genérico. Neste caso é possível obter o
mesmo resultado, somente com aplicação de polimorfismo por meio da interface
Superficie.