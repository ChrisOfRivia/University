#include <stdio.h>

int main(){
    int a = 5;
    int* p = &a;

    printf("Address of a: %p\n", p);
    printf("Value of a: %d", *p);
    return 0;
}