#include <stdio.h>

int main(){
    int num, division;
    printf("Enter a number: ");
    scanf("%d", &num);
    division = num % 8;
    if(division > 4){
        printf("%d is greater than 4!", division);
    }
    return 0;
}