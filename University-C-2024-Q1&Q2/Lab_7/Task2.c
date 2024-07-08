#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr, *new_ptr;
    int n;

    printf("Enter N: ");
    scanf("%d", &n);

    ptr = (int *)calloc(n, sizeof(int));

    if (ptr == NULL) {
        printf("Data is NOT allocated!");
        return 1;
    }

    printf("Calloc address: %p\n", (void *)ptr);

    for (int i = 0; i < n; i++) {
        ptr[i] = 20 * i - i * i;
    }

    printf("Elements: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", ptr[i]);
    }

    new_ptr = (int *)calloc(n - 1, sizeof(int));
    if (new_ptr == NULL) {
        printf("Data is NOT allocated!");
        return 1;
    }
    for (int i = 0; i < n - 1; i++) {
        new_ptr[i] = (ptr[i + 1] - ptr[i]) / (i + 1 - i);
    }
    printf("\nElements: ");
    for (int i = 0; i < n - 1; i++) {
        printf("%d ", new_ptr[i]);
    }

    free(new_ptr);
    free(ptr);
}