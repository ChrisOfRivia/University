#include <stdio.h>

void transportMat (int nums[][30], int n){
    for(int i = 0; i < n; i++){
        for(int j = i + 1; j < n; j++){
            int temp = nums[i][j];
            nums[i][j] = nums[j][i];
            nums[j][i] = temp;
        }
    }
}

void printMat(int nums[][30], int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            printf("%d ", nums[i][j]);
        }
        printf("\n");
    }
}

int main(){
    int n;
    printf("Enter size: ");
    scanf("%d", &n);

    int nums[30][30];

    printf("Fill the matrix: ", n*n);
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            scanf("%d", &nums[i][j]);
        }
    }

    printMat(nums, n);

    printf("\n");

    transportMat(nums, n);
    printMat(nums, n);
}