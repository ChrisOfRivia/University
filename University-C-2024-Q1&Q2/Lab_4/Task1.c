#include <stdio.h>

void sum_numbers(int* nums, int size){
    int sum = 0;
    for(int j = 0; j < size; j++){
        sum += nums[j];
    }
    printf("%d", sum);
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
    sum_numbers(numbers, 7);
    return 0;
}