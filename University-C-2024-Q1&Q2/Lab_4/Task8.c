#include <stdio.h>
#include <stdlib.h>
#include <time.h.>

void print_ints(int* nums, int size){
    for(int j = 0; j < 10; j++){
        printf("%d ", nums[j]);
    }
    printf("\n");
}
void print_floats(float* nums, int size){
    for(int j = 0; j < 10; j++){
        printf("%.2f ", nums[j]);
    }
    printf("\n");
}

int main(){

    int rand_int[10];
    float rand_float1[10];
    float rand_float2[10];
    float rand_float3[10];

    srand(time(NULL));

    for(int i = 0; i < 10; i++){
        rand_int[i] = rand();
        rand_float1[i] = (float)(rand()) / (float)RAND_MAX;
        rand_float2[i] = (float)(rand()) / (float)RAND_MAX * 5;
        rand_float3[i] = (float)(rand()) / (float)RAND_MAX * 5 - 2;

    }

    print_ints(rand_int, 10);
    print_floats(rand_float1, 10);
    print_floats(rand_float2, 10);
    print_floats(rand_float3, 10);

    return 0;
}