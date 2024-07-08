#include <stdio.h>
#include <stdlib.h>

void sort(int* array_nums, int array_size){
    int i, j, temp;
    for (i = 0; i < (array_size - 1); ++i){
        for (j = 0; j < array_size - 1 - i; ++j){   
            if (array_nums[j] > array_nums[j+1]){
                temp = array_nums[j+1];
                array_nums[j+1] = array_nums[j];
                array_nums[j] = temp;
            }
        }
    }
}

int largest_num(int* array_nums, int array_size){
    int i, biggest_num = array_nums[0];
    for (i = 0; i < (array_size - 1); ++i){
        if(biggest_num < array_nums[i + 1]){
            biggest_num = array_nums[i + 1];
        }
    }
    return biggest_num;
 }

int main(){
    int size, current_num, biggest_num;
    printf("Enter size of array: ");
    scanf("%d", &size);
    int* int_arr = (int*)malloc(size);

    for(int i = 0; i < size; i++){
        printf("Enter a number: ");
        scanf("%d", &current_num);
        int_arr[i] = current_num;
    }

    sort(int_arr, size);
    biggest_num = largest_num(int_arr, size);
    printf("Start of arr: %d\n", int_arr[0]);
    printf("Longest num: %d\n", biggest_num);
    free(int_arr);
    return 0;
}