// Funcionando instantaneamente com as entradas tinyUF.txt e mediumUF.txt, porém com a entrada 
// largeUF.txt extremamente lenta

// nesse caso muitas alterações podem ser necessárias na função union_UF cada vez que uma união for realizada

//            1
//  /  /  /  /  \  \  \  \
//  2  3  4  5  6  7  8  9

#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    int *id;
    int count;
    int n;
} UF;

UF *init_UF(int n);
int count_UF(UF *uf);
int connected_UF(UF *uf, int p, int q);
int find_UF(UF *uf, int p);
void union_UF(UF *uf, int p, int q);

UF *init_UF(int n)
{
    int i;
    UF *uf;

    uf = malloc(sizeof(UF));

    uf->id = malloc(sizeof(int) * n);
    uf->n = n;
    uf->count = n;
    for (i = 0; i < uf->count; ++i)
    {
        uf->id[i] = i;
    }

    return (uf);
}

int count_UF(UF *uf)
{
    return (uf->count);
}

int connected_UF(UF *uf, int p, int q)
{
    return (find_UF(uf, p) == find_UF(uf, q));
}

int find_UF(UF *uf, int p)
{
   return uf->id[p];
}

void union_UF(UF *uf, int p, int q)
{
    int i;
    int p_value = uf->id[p];
    int q_value = uf->id[q];

    for (i = 0; i < uf->count; i++)
    {
        if (p_value == uf->id[i])
        {
            uf->id[i] = q_value;
        }
    }
}

int main()
{
    int n, p, q;
    UF *uf;

    scanf("%d", &n);

    uf = init_UF(n);

    scanf("%d %d", &p, &q);
    while (p > -1 && q > -1)
    {

        if (!connected_UF(uf, p, q))
        {
             printf("%d %d\n", p, q);
            union_UF(uf, p, q);
        }

        scanf("%d %d", &p, &q);
    }
}
