#include <stdio.h>
#include <stdlib.h>

void move_elements_K_times(int* array_nums, int size, int move){
    int i, j, temp, last_num;

    for(i = 0; i < move; i++){
        last_num = array_nums[size - 1];
        for(j = size - 1; j > 0; j--){
            array_nums[j] = array_nums[j - 1];
        }
        array_nums[0] = last_num;
    }
}

int main(){
    int N, K, current_num;
    printf("Enter size of array: ");
    scanf("%d", &N);
    int* first_arr = (int*)malloc(N * sizeof(int)); 

    for(int i = 0; i < N; i++){ 
        printf("Enter num: ");
        scanf("%d", &current_num);
        first_arr[i] = current_num;
    }

    printf("How many spaces to move numbers? (K): ");
    scanf("%d", &K);
    move_elements_K_times(first_arr, N, K);

    printf("Array after moving %d spaces:\n", K);
    for(int i = 0; i < N; i++){
        printf("%d ", first_arr[i]);
    }
    free(first_arr); 
    return 0;
}
