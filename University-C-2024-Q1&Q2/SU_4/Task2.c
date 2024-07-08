#include <stdio.h>
#include <stdlib.h>

int check_relation(int* nums, int size){
    int relation_checker;
    for(int j = 0; j < size; j++){
        if(j == 0){
            continue;
        }
        else if(j == (size - 1)){
            continue;
        }
        else{
            if(j % 2 != 0){
                if(nums[j] > nums[j - 1] && nums[j] > nums[j + 1]){
                    relation_checker = 1;
                }
                else{
                    return 0;
                }
            }
            else{
                if(nums[j] < nums[j - 1] && nums[j] < nums[j + 1]){
                    relation_checker = 1;
                }
                else{
                    return 0;
                }
            }
        }
    }

    if(relation_checker == 1){
        return 1;
    }

}

int main(){
    int N, current_num;
    printf("Enter number of nums: ");
    scanf("%d", &N);
    int* ptr = (int*)malloc(N);

    for(int i = 0; i < N; i++){
        printf("Enter num: ");
        scanf("%d", &current_num);

        ptr[i] = current_num;
    }

    for(int x = 0; x < N; x++){
        printf("%d ", ptr[x]);
    }

    int value = check_relation(ptr, N);
    if(value == 1){
        printf("Relation is fully correct!");
    }
    else{
        printf("Relation has flaws or is fully incorrect!");
    }
    free(ptr);
    return 0;
}