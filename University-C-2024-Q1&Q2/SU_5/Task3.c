#include <stdio.h>
#include <stdlib.h>

int findMinRowIndex(int **matrix, int rows, int cols) {
    int minRow = 0;
    int minElement = matrix[0][0];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] < minElement) {
                minElement = matrix[i][j];
                minRow = i;
            }
        }
    }

    return minRow;
}

int findMaxRowIndex(int **matrix, int rows, int cols) {
    int maxRow = 0;
    int maxElement = matrix[0][0];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] > maxElement) {
                maxElement = matrix[i][j];
                maxRow = i;
            }
        }
    }

    return maxRow;
}

void swapRows(int **matrix, int row1, int row2) {
    int *temp = matrix[row1];
    matrix[row1] = matrix[row2];
    matrix[row2] = temp;
}

int main() {
    int N, M;
    printf("Enter the number of rows (N): ");
    scanf("%d", &N);
    printf("Enter the number of columns (M): ");
    scanf("%d", &M);

    int **matrix = (int **)malloc(N * sizeof(int *));
    for (int i = 0; i < N; i++) {
        matrix[i] = (int *)malloc(M * sizeof(int));
    }

    printf("Enter the elements of the matrix, row by row:\n");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            scanf("%d", &matrix[i][j]);
        }
    }

    int minRowIndex = findMinRowIndex(matrix, N, M);
    int maxRowIndex = findMaxRowIndex(matrix, N, M);

    swapRows(matrix, minRowIndex, maxRowIndex);

    printf("Matrix after swapping rows:\n");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }

    for (int i = 0; i < N; i++) {
        free(matrix[i]);
    }
    free(matrix);

    return 0;
}
