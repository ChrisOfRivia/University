#include <stdio.h>
#include <stdlib.h>

void bubble_sort(int* arr, int N) {  
    int i, j;  
    for (i = 0; i < N - 1; i++) {  
        for (j = 0; j < N - i - 1; j++) {  
            if (arr[j] > arr[j + 1]) {  
                int temp = arr[j];  
                arr[j] = arr[j + 1];  
                arr[j + 1] = temp;  
            }  
        }  
    }  
}  

int main() {
    FILE *fptr;
    int N, num, odd = 0, even = 0, digit;
    fptr = fopen("Numbers.bin", "wb");

    printf("N: ");
    scanf("%d", &N);
    fwrite(&N, sizeof(int), 1, fptr);

    for (int i = 0; i < N; i++) {
        printf("Number[%d]: ", (i + 1));
        scanf("%d", &num);
        fwrite(&num, sizeof(int), 1, fptr);

        int temp = num;
        while (temp != 0) {
            digit = temp % 10;
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            temp /= 10;
        }
    }

    fclose(fptr);
    printf("\nOdd digits: %d\n", odd);
    printf("Even digits: %d\n", even);

    fptr = fopen("Numbers.bin", "rb");
    fread(&N, sizeof(int), 1, fptr);
    int* nums = (int*)malloc(sizeof(int) * N);
    for (int i = 0; i < N; i++) {
        fread(&nums[i], sizeof(int), 1, fptr);
    }
    fclose(fptr);

    bubble_sort(nums, N);

    fptr = fopen("Numbers.txt", "w");
    for(int i = 0; i < N; i++) {
        fprintf(fptr, "%d ", nums[i]);
    }

    fclose(fptr);
    free(nums);
    return 0;
}
