#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr;
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
        ptr[i] = 20 * i - i;
    }

    printf("Elements: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", ptr[i]);
    }
    // free(ptr);
    if (ptr != NULL) {
        printf("\nData was NOT freed!\n");
    }

    ptr = (int *)realloc(ptr, 3 * sizeof(int));
    if (ptr == NULL) {
        printf("Data is NOT reallocated.\n");
        return 1;
    }

    printf("Realloc: %p\n", (void *)ptr);
    printf("Elements:  ");
    for (int i = 0; i < 3; i++) {
        printf("%d ", ptr[i]);
    }
    free(ptr);
    printf("\nData was freed!\n");
    return 0;
}
