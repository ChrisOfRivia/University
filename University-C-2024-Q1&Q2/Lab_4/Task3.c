#include <stdio.h>

void median_numbers(int* nums, int size){
    double sum = 0, median;
    for(int j = 0; j < size; j++){
        sum += nums[j];
    }
    median = sum / 7;
    printf("%.3lf", median);
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
    median_numbers(numbers, 7);
    return 0;
}