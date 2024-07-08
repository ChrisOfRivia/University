#include <stdio.h>

void check_for_even_odd(int number){
    if(number % 2 == 0){
        printf("%d is even", number);
    }
    else{
        printf("%d is odd", number);
    }
}


int main(){
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    check_for_even_odd(num);
    return 0;
}