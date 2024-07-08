#include <stdio.h>
#include <stdlib.h>

int main() {
    int **xt;
    int t = 0;

    xt = (int **)malloc(2 * sizeof(int *));
    for (int i = 0; i < 2; i++) {
        xt[i] = (int *)malloc(5 * sizeof(int));
    }

    printf("Addresses returned by malloc:\n");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 5; j++) {
            printf("xt[%d][%d]: %p\n", i, j, (void *)&xt[i][j]);
        }
    }

    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 5; j++) {
            if (i == 0) {
                xt[i][j] = t = j;
                xt[i][j] = 19 - 2 * t;
            } else if (i == 1) {
                xt[i][j] = t = j + 1;
                xt[i][j] = t;
            }
        }
    }

    printf("\nElements:\n");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 5; j++) {
            printf("%d\n", xt[i][j]);
        }
    }

    for (int i = 0; i < 2; i++) {
        free(xt[i]);
    }
    free(xt);

    return 0;
}
