#include <stdio.h>

int main(){
    int a = 22, b = 7;
    float c = 22, d = 7;

    printf("1: Pi = %d\n", a / b);
    printf("2: Pi = %f\n", a / (float)b);
    printf("3: Pi = %f\n", c / d);
    printf("4: Pi = %f\n", ((float)a)/b);
    printf("5: Pi = %f\n", a + b / c + d);
    printf("6: Pi = %f\n", (a + b) / (c + d));
    printf("7: Pi = %f\n", ++a + b++);
    
    return 0;
}