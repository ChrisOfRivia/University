#include <stdio.h>
#include <stdlib.h>

int main() {
    int N, M;
    
    printf("N: ");
    scanf("%d", &N);
    printf("M: ");
    scanf("%d", &M);
    
    int **array = (int **)malloc(N * sizeof(int *));
    for (int i = 0; i < N; i++) {
        array[i] = (int *)malloc(M * sizeof(int));
    }
    
    printf("Enter the elements of the array:\n");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            printf("Element [%d][%d]: ", i, j);
            scanf("%d", &array[i][j]);
        }
    }
    
    int rowsIncreasing = 1;
    for (int i = 0; i < N; i++) {
        for (int j = 1; j < M; j++) {
            if (array[i][j] <= array[i][j - 1]) {
                rowsIncreasing = 0;
                break;
            }
        }
    }
    
    int columnsDecreasing = 1;
    for (int i = 0; i < M; i++) {
        for (int j = 1; j < N; j++) {
            if (array[j][i] >= array[j - 1][i]) {
                columnsDecreasing = 0;
                break;
            }
        }
    }
    
    if (rowsIncreasing) {
        printf("Every row is increasing.\n");
    } else {
        printf("Not every row is increasing.\n");
    }
    
    if (columnsDecreasing) {
        printf("Every column is decreasing.\n");
    } else {
        printf("Not every column is decreasing.\n");
    }
    
    for (int i = 0; i < N; i++) {
        free(array[i]);
    }
    free(array);
    
    return 0;
}
