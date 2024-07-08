#include <stdio.h>

int main(){
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    if(num > 6){
        printf("Number is greater than 6!");
    }
    return 0;
}