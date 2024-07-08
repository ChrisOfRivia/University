#include <stdio.h>

int main(){
    printf("\n Char -> %d byte\n", sizeof(char));
    printf(" Short -> %d bytes\n", sizeof(short));
    printf(" Int -> %d bytes\n", sizeof(int));
    printf(" Long -> %d bytes\n", sizeof(long));
    printf(" Double -> %d bytes\n", sizeof(double));
    printf(" Float -> %d bytes\n", sizeof(float));
    return 0;
}