#include <stdio.h>
#include <stdlib.h>

void print_int_arrays(int* array, int size){
    for(int i = 0; i < size; i++){
        printf("%d ", array[i]);
    }
}

int main(){
    int size, current_num;
    printf("Enter size of arrays: ");
    scanf("%d", &size);
    int* first_arr = (int*)malloc(size);
    int* temp = (int*)malloc(size);

    for(int i = 0; i < size; i++){
        printf("Enter num: ");
        scanf("%d", &current_num);
        first_arr[i] = current_num;
    }

    for(int j = 0; j < size; j++){
        temp[size - (j + 1)] = first_arr[j];

    }

    printf("First array: \n");
    print_int_arrays(first_arr, size);
    printf("\n");
    printf("Second array: \n");
    print_int_arrays(temp, size);

    free(temp);
    free(first_arr);
    return 0;
}