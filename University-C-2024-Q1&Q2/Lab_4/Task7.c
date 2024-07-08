#include <stdio.h>
#include <stdlib.h>
#include <time.h>

double median_speed(int* nums_speed, int* nums_time, int size){
    double sum_VT, sum_T;
    for(int i = 0; i < size; i++){
        sum_VT += (nums_speed[i]*nums_time[i]);
        sum_T += nums_time[i];
    }
    return sum_VT / sum_T;
}

int main(){
    int v[6], t[6]; //t[6] = {2, 12, 5, 7, 9, 10}

    srand(time(NULL));

    for(int j = 0; j < 6; j++){
        v[j] = rand() % 100;
        t[j] = rand() % 100;
    }

    double median = median_speed(v, t, 6);
    printf("%.3lf", median);
    return 0;
}