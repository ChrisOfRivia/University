#include <stdio.h>

void counter(int* a){
    int number;
    scanf("%d", &number);
    while (number > 0){
        number = number / 10;
        *a += 1;
    }
}

int main(){
    int a = 0;
    counter(&a);
    printf("Digit: %d\n", a);
    return 0;
}