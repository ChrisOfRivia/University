#include <stdio.h>

int main(){
    int num1, num2, num3;
    printf("Enter 3 numbers: ");
    scanf("%d %d %d", &num1, &num2, &num3);

    (num1 == num2 && num1 == num3) ? printf("yes") : printf("no");
}