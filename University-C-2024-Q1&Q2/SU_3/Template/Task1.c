#include <stdio.h>
#include <stdlib.h>
#include "Tasks.h"

void fcTask1(void)
{
    // float num1, num2;
    // printf("Enter 2 numbers: ");
    // scanf("%f %f", &num1, &num2);
    // (num1 > num2) ? printf("%.2f", num1) : printf("%.2f", num2);

    int counter = 0;
    int* numbers = malloc(sizeof(int) * 64);
    while(1){
        int number;
        printf("Enter a number [0 to end cycle]: ");
        scanf("%d", &number);
        if(number == 0){
            break;
        }
        numbers[counter] = number;
        counter ++;


    }
    get_max_min_num(numbers, counter);
    free(numbers);
    return 0;
}

void get_max_min_num(int* nums, int size){
    int max_num = nums[0];
    int min_num = nums[0];

    for(int j = 0; j < size; j++){
        if(nums[j] > max_num){
            max_num = nums[j];
        }
        if(nums[j] < min_num){
            min_num = nums[j];
        }
    }

    printf("Min number: %d\n", min_num);
    printf("Max number: %d\n", max_num);
}