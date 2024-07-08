#include <stdio.h>
#include <math.h>

double median_numbers(int* nums, int size){
    double sum = 0, median;
    for(int j = 0; j < size; j++){
        sum += nums[j];
    }
    median = sum / 7;
    return median;
}

void get_num_closest_to_median(int* nums, int size, double median){
    double closest_num = fabs(nums[0] - median), difference;
    int counter = 0, position;

    
    for(int x = 0; x < size; x++){
        difference = fabs(nums[x] - median);
        if(difference < closest_num){
            closest_num = difference;
            position = x;
        }
        
    }
  

    printf("Median: %.2lf\nClosest value: %d\nIndex of closest value: %d", median, nums[counter], counter+1);

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
    double median = median_numbers(numbers, 7);
    get_num_closest_to_median(numbers, 7, median);
    return 0;
}