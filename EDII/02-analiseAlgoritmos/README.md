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

exemplo: 
n == 4
3*3 == 9 comparações.
```

  As comparações tanto no **melhor** caso quanto no **pior** serão sempre iguais a quantidade de iterações do laço **for** interno multiplicado pelo laço **for** externo.

  ---

### selection_sort:
```
Melhor caso:

Pior caso:
```
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

    Caso o vetor já esteja ordenado (1,2,3) não é realizada nenhuma troca, já que a comparação feita é se um elemento é maior que o seu próximo elemento.

    Pior caso -> (n * (n - 1)) / 2 trocas.

    Caso o vetor esteja em ordem decrescente(3, 2, 1) será realizado a quantidade de trocas igual à: (n * (n - 1)) / 2
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
  selection_sort:
    
    Melhor caso:

    Pior caso:
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
    Melhor caso:

    Pior caso:
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
