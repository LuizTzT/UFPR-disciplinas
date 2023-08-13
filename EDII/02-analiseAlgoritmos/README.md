<p align="center">
<img src="./imgs/On.png" width="400" height="400">
</p>

## Análise de Algoritmos Básicos de Ordenação

### Faça a análise de complexidade dos algoritmos de ordenação abaixo, respondendo às seguintes perguntas:

-   Quantas comparações o algoritmo faz no melhor caso? E no pior caso?

### bubble_sort:
```
Melhor caso: (n-1) * (n-1)
Pior caso: (n-1) * (n-1)

Exemplo: 
n == 4
3*3 == 9 comparações.
```

  As comparações tanto no **melhor** caso quanto no **pior** serão sempre iguais a quantidade de iterações do laço **for** interno multiplicado pelo laço **for** externo.

  ---

### selection_sort:
```
Melhor caso: (n * (n-1))/2
Pior caso: (n * (n-1))/2

Exemplo:
n == 4
(4 * (4-1))/2 == 6 comparações.
```
Assim como no **bubble sort** tanto as comparações no **melhor** quanto no **pior** caso são semelhantes, já que não importa se o vetor está ordenado, a mesma quantidade de iterações serão realizadas.

A quantidade de comparações aqui pode ser extraída por meio da formula **(n * (n-1))/2**, isso me permite calcular as comparações mais facilmente já que a cada iteração do loop externo o loop interno diminui suas iterações de forma proporcional

    Exemplo:
    n == 4
    for externo -> 4 iterações.
    for interno -> 4, 3, 2, 1, 0 iterações.

    Isso quer dizer que a cada iteração do for externo o interno diminui uma iteração.

### insertionSort:
  ```
    Melhor caso:

    Pior caso:
  ```
---
---
---
-   Quantas trocas o algoritmo faz no melhor caso? E no pior caso?

### bubble_sort:

    Melhor caso -> 0 trocas.

    Caso o vetor já esteja ordenado, por exemplo: [1, 2, 3] não é realizada nenhuma troca, já que a comparação feita é se um elemento é maior que o seu próximo elemento.

    Pior caso -> (n * (n - 1)) / 2 -> trocas.

    Caso o vetor esteja em ordem decrescente([3, 2, 1]) será realizado a quantidade de trocas igual à (n * (n - 1)) / 2
      Exemplo:
        n == 3
        (3 * (3 - 1)) / 2
        6 / 2 == 3 trocas.

        k == 1
        3 2 1 -> vetor inicial.
        2 3 1 -> j == 0 -> 1ª troca.
        2 1 3 -> j == 1 -> 2ª troca.

        k == 2
        2 1 3 -> vetor inicial.
        1 2 3 -> j == 0 -> 3ª troca -> vetor ordenado.

### selection_sort:
  ```
  Melhor caso -> 0 trocas.

  Caso o vetor já esteja ordenado, por exemplo: [1, 2, 3] não é realizada nenhuma troca, já que a comparação feita é se um elemento é menor que o seu elemento anterior.

  Pior caso:

  Caso o vetor esteja em uma ordem aleatória ([3, 1, 2]) será realizado 2 trocas.

  Exemplo:
  n == 3

  i == 0
  3 1 2 -> vetor inicial.
  1 3 2 -> j == 2 -> 1ª troca.

  i == 1
  1 3 2 -> vetor inicial.
  1 2 3 -> j == 3 -> 2ª troca.
  ```
### insertionSort:
  ```
    Melhor caso:

    Pior caso:
  ```
---
---
---
-   Qual a complexidade do algoritmo no melhor caso? E no pior caso?

### bubble_sort:
  ```
  Melhor caso -> O(n^2)
  Pior caso -> O(n^2)

  Como não existe nenhum mecanismo para identificar quando o vetor já está ordenado, tanto para o pior dos casos(vetor em ordem descrescente) quanto para o melhor(vetor já ordenado), serão realizadas (n-1) * (n-1) comparações(operação fundamental). 
  
  Dessa forma a complexidade é igual nos dois casos, sendo:
  (n-1)^2 ou O(n^2).

  Exemplo:
  n == 3
  O(3^2) == 9 comparações.
  
  Já que o k e o j não vão comparar o último elemento do vetor com o próximo(inexistente) a complexidade ainda se mantém O(n^2), porém ficando da seguinte forma:
  (3-1)^2 == 4 comparações ou
  O(2^2) == 4 comparações.

  ```

### selection_sort:
  ```
  Melhor caso: O(n^2)
  Pior caso: O(n^2)

  Já que nesse algoritmo assim como no bubble sort não existe nenhum mecanismo para identificar se o vetor está ordenado, será realizada a mesma quantidade de comparações tanto no melhor quanto no pior caso.

  Exemplo:
  [1, 2, 3]
  [3, 1, 2]
  (n * (n-1))/2 -> 3 comparações.

  Como pode ser visto, em ambos os casos serão realizadas 3 comparações, independentemente do vetor estar ordenado ou não.
  ```
### insertionSort:
  ```    
    Melhor caso:

    Pior caso:
  ```
### Algoritmos: 

#### Bubble Sort :

```c
void bubble_sort (int vetor[], int n) {
    int k, j, aux;

    for (k = 1; k < n; k++) {

        for (j = 0; j < n - 1; j++) {

            if (vetor[j] > vetor[j + 1]) {
                aux = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = aux;
            }
        }
    }
}
```

#### Selection Sort:
```c
void selection_sort(int num[], int tam) {
  int i, j, min, aux;
  for (i = 0; i < (tam-1); i++)
  {
     min = i;
     for (j = (i+1); j < tam; j++) {
       if(num[j] < num[min])
         min = j;
     }
     if (num[i] != num[min]) {
       aux = num[i];
       num[i] = num[min];
       num[min] = aux;
     }
  }
}
```

#### Insertion Sort:
```c
void insertionSort(int* original, int length) {
	int i, j, atual;

	for (i = 1; i < length; i++) {
		atual = original[i];

		for (j = i - 1; (j >= 0) && (atual < original[j]); j--) {
			original[j + 1] = original[j];
        }

		original[j+1] = atual;
	}
}
```
