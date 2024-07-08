#include <stdio.h>

int main(){
    int a, b;
    printf("Enter 2 numbers: ");
    scanf("%d %d", &a, &b);
    int* pa = &a;
    int* pb = &b;

    int sum = *pa + *pb;
    printf("%d + %d = %d\n", *pa, *pb, sum);

    int sub = *pa - *pb;
    printf("%d - %d = %d\n", *pa, *pb, sub);

    float mult = *pa * *pb;
    printf("%d * %d = %.2f\n", *pa, *pb, mult);

    float div = *pa / *pb;
    printf("%d / %d = %.2f\n", *pa, *pb, div);



}