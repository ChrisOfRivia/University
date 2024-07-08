#include <stdio.h>

int main(){
    int num, sum;

    while(1){
        printf("Enter a number: ");
        scanf("%d", &num);
        if(num == 0){
            break;
        }
        sum += num;
    }
    printf("%d", sum);
    return 0;
}