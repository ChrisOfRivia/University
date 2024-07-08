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
    int num, odd = 0, even = 0, digit;
    char choice;
    
    fptr = fopen("Numbers.bin", "wb");
    do {
        printf("Enter a number: ");
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

        printf("Do you want to enter another number? (y/n): ");
        scanf(" %c", &choice);
    } while (choice == 'y' || choice == 'Y');

    fclose(fptr);

    printf("\nOdd digits: %d\n", odd);
    printf("Even digits: %d\n", even);

    fptr = fopen("Numbers.bin", "rb");

    fseek(fptr, 0, SEEK_END);
    int fileSize = ftell(fptr);
    int N = fileSize / sizeof(int);
    rewind(fptr);

    int* nums = (int*)malloc(sizeof(int) * N);
    fread(nums, sizeof(int), N, fptr);
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
