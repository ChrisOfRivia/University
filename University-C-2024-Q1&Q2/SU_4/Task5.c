#include <stdio.h>
#include <stdlib.h>

void reverse_sort(int* array_nums, int array_size)
{
    int i, j, temp;
    for (i = 0; i < array_size; ++i) 
    {
        for (j = i + 1; j < array_size; ++j) 
        {
            if (array_nums[i] < array_nums[j]) 
            {
                    temp = array_nums[i];
                    array_nums[i] = array_nums[j];
                    array_nums[j] = temp;
            }
        }
    }
 
}

int main(){
    int size, current_num, K;
    printf("Enter size of array: ");
    scanf("%d", &size);
    int* int_arr = (int*)malloc(size);

    for(int i = 0; i < size; i++){
        printf("Enter a number: ");
        scanf("%d", &current_num);
        int_arr[i] = current_num;
    }

    reverse_sort(int_arr, size);
    printf("Which biggest number do you want (K): ");
    scanf("%d", &K);
    printf("[%d] biggest number: %d", K, int_arr[K - 1]);

    free(int_arr);
    return 0;
}