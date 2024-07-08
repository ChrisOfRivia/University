#include <stdio.h>

void decimalToBinary(int number){
    char numbers[32];
    int remainder, counter;
    while(number <= 0){
        remainder = number % 2;
        number /= 2;
        numbers[counter] = remainder;
        counter ++;

    }
    for(int i = 0; i < sizeof(numbers)/sizeof(numbers[0]); i++){
        printf("%d", numbers[i]);
    }
}

int main(){
    int a;
    printf("Enter a number: ");
    scanf("%d", &a);
    decimalToBinary(a);

    return 0;
}