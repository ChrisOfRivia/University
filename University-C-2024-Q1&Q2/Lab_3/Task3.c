#include <stdio.h>

void dec_to_bin(int a){
    int binaryNum[32];
    int i = 0;
    while(a > 0){
        binaryNum[i] = a % 2;
        a = a / 2;
        i++;
    }
    for (int j = i - 1; j >= 0; j--){
        printf("%d", binaryNum[j]);

    }
    printf("\n");
}

int main(){
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    dec_to_bin(num);
    return 0;
}