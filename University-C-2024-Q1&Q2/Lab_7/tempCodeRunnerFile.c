#include <stdio.h>
#include <stdlib.h>

int main() {
    int **xt;

    xt = (int **)malloc(2 * sizeof(int *));
    for (int i = 0; i < 2; i++) {
        xt[i] = (int *)malloc(5 * sizeof(int));
    }