#include <stdio.h>
#include <stdlib.h>

int main() {
    int **xt, **vtv;
    int t = 0;
    int suma = 0;
    float average = 0.0;

    xt = (int **)malloc(2 * sizeof(int *));
    for (int i = 0; i < 2; i++) {
        xt[i] = (int *)malloc(5 * sizeof(int));
    }

    vtv = (int **)malloc(3 * sizeof(int *));
    for (int i = 0; i < 3; i++) {
        vtv[i] = (int *)malloc(5 * sizeof(int));
    }

    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 5; j++) {
            if (i == 0) {
                t = j;
                xt[i][j] = 19 - 2 * t;
            } else if (i == 1) {
                t = j + 1;
                xt[i][j] = t;
            }
        }
    }

    printf("Elements of xt:\n");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 5; j++) {
            printf("%d ", xt[i][j]);
        }
        printf("\n");
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 5; j++) {
            if (i == 0 || i == 1) {
                vtv[i][j] = xt[i][j];
            } else if (i == 2) {
                vtv[i][j] = xt[i - 2][j] * 1;
                suma += vtv[i][j];
            }
        }
    }

    printf("\nElements of vtv:\n");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 5; j++) {
            printf("%d ", vtv[i][j]);
        }
        printf("\n");
    }

    average = (float)suma / 5;
    printf("\nAverage of elements in the third row: %.2f\n", average);

    for (int i = 0; i < 2; i++) {
        free(xt[i]);
    }
    free(xt);

    for (int i = 0; i < 3; i++) {
        free(vtv[i]);
    }
    free(vtv);
    return 0;
}
