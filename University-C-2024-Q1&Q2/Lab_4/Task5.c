#include <stdio.h>

int* velocity(int* nums){
    static int dx[5];
    for(int j = 0; j < 5; j++){
        // x[i + 1] - x[i]
        dx[j] = nums[j + 1] - nums[j];
    }
    return dx;
}

int main(){
    // t = 0,1,2,3,4,5  
    // x = 20 * t - t * t

    int x[6];

    for(int i = 0; i < 6; i++){
        x[i] = 20 * i - i * i;
    }
    

    int *p = velocity(x);
    for(int a = 0; a < 5; a++){
        printf("%d\n", p[a]);
    }

    return 0;
}