#include <stdio.h>

void get_max_min_num(int* nums, int size){
    int max_num = nums[0];

    for(int j = 0; j < size; j++){
        if(nums[j] > max_num){
            max_num = nums[j];
        }
    }
    printf("Max number: %d", max_num);
}

int main(){
    int numbers[7], num;

    for(int i = 1; i <= 7; i++){
        printf("[%d] Enter a number: ", i);
        scanf("%d", &num);
        if(-5000 <= num <= 5000){
            numbers[i - 1] = num;
        }
        else{
            continue;
        }
    }
    get_max_min_num(numbers, 7);
    return 0;
}