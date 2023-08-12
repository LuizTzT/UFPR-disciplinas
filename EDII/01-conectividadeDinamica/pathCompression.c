// Execução com a entrada largeUF em 1 segundo.

#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int *id;
    int count;
    int n;
} UF;

UF *init_UF(int n) {
    int i;
    UF *uf;

    uf = malloc(sizeof(UF));

    uf->id = malloc(sizeof(int) * n);
    uf->n = n;
    uf->count = n;

    for (i = 0; i < uf->count; ++i) {
        uf->id[i] = i;
    }

    return uf;
}

int count_UF(UF *uf) {
    return uf->count;
}

int find_UF(UF *uf, int p) {
    int root = p;
    while (root != uf->id[root]) {
        root = uf->id[root];
    }

    // Compressão de Caminho Iterativa
    // aponta todos os nodes para o root, reduzindo a altura da árvore
    while (p != root) {
        uf->id[p] = uf->id[uf->id[p]];
        p = uf->id[p];
    }

    return root;
}

int connected_UF(UF *uf, int p, int q) {
    return (find_UF(uf, p) == find_UF(uf, q));
}

void union_UF(UF *uf, int p, int q) {
    int rootP = find_UF(uf, p);
    int rootQ = find_UF(uf, q);

    if (rootP == rootQ) {
        return;
    }

    uf->id[rootP] = rootQ;

    uf->count--;
}

int main() {
    int n, p, q;
    UF *uf;

    scanf("%d", &n);

    uf = init_UF(n);

    while (scanf("%d %d", &p, &q) == 2 && p >= 0 && q >= 0) {
        if (!connected_UF(uf, p, q)) {
            // printf("%d %d\n", p, q); comentado para verificar a eficiência do código
            union_UF(uf, p, q);
        }
    }

    return 0;
}

