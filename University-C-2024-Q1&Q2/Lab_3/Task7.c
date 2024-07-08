#include <stdio.h>

void changeValues(int* pa, int* pb){
    int temp = *pa;
    *pa = *pb;
    *pb = temp;
}

int main(){
    int a = 5;
    int b = 6;

    changeValues(&a, &b);
    printf("A -> %d\nB -> %d", a, b);



    return 0;
}