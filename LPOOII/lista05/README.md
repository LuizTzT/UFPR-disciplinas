### (Tarefa 9) Considere a classe Bicicleta abaixo:

```java
class Bicicleta {
  int cadencia = 0;
  int velocidade = 0;
  int marcha = 1;

  void mudarCadencia(int novoValor){
    cadencia = novoValor;
  }
  void mudarMarcha(int novoValor){
    marcha = novoValor;
  }
  void aumentarVelocidade(int incremento){
    velocidade = velocidade + incremento;
  }
  void aplicarFreios(int decremento){
    velocidade = velocidade - decremento;
  }
  void printStates(){
    System.out.println("cadencia="+cadencia+" velocidade="+velocidade+"
    marcha="+marcha);
  }
}
```
- Crie uma classe UsaBicicleta com o seu método main. No método main crie uma instância de uma classe anônima herdando de bicicleta. 
- Nesta classe anônima sobrescreva o método
aplicarFreios para: velocidade = velocidade – 2*decremento. Use esta instância e veja como se comporta.

---

### Tarefa Adicional

#### Considere o código abaixo:

```java
public class Outer {
  private int x = 0;

  public static void main(String[] args) {
    Outer o = new Outer();
    Inner i = o.new Inner();
    o.print();
  }

  public void print() {
    System.out.println("x before: " + x);
    Inner i = new Inner();
    i.print();
  }

  class Inner {
    public void print() {
      x++; // linha 16 no exemplo
      System.out.println("x after: " + x);
    }
  }
}
```

- Implemente e explique o seu funcionamento. Explique porque não ocorre erro de compilação na linha 16, uma vez que estamos acessando diretamente um membro privado da classe Outer.

---

#### (Tarefa 10) Faça uma classe executável que dado a distância percorrida (em Km) e o tempo gasto em uma viagem (em horas):

- Informe a velocidade média do carro, sabendo que Velocidade = &Delta;S / &Delta;T (variação de distância / variação do tempo).
- Imprima o valor com duas casas decimais. Utilize a classe BigDecimal. 
- Os valores de entrada devem ser obtidos do teclado e convertidos para double e depois para BigDecimal. Todos os
cálculos devem ser feitos com BigDecimal. 
- Faça com que todos os números nos cálculos
sejam arredondados para 3 casas decimais (utilize o setScale do BigDecimal, e estude o modo de arredondamento “RoundingMode” mais adequado para este caso). 
- Os valores de entrada podem ter até 10 casas decimais e devem ser arredondados para 3 casas decimais