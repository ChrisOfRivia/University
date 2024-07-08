#include <stdio.h>

int main(){
    char sym = 'a';
    int b = 102;
    long c = 50000;
    float d = 6;
    double e = -48.907;

    printf("Ascii char # -> %d\n", sym);
    printf("Ascii char value -> %c\n", sym);
    printf("Int -> %d\n", b);
    printf("Long -> %ld\n", c);
    printf("Float -> %.2f\n", d);
    printf("Float science format -> %0.2e\n", d);
    printf("Double -> %.2lf\n", e);
    printf("Double science format -> %0.2e\n", e);

    return 0;
}