#include <stdio.h>

int main(){
    int a, b;
    // printf("A = ");
    // scanf("%d", &a);
    // printf("B = ");
    // scanf("%d", &b);

    // printf("You entered: A(%d) and B(%d)", a, b);

    printf("Enter 2 integers separated with a whitespace: ");
    scanf("%d %d", &a, &b);
    printf("You entered: A(%d) and B(%d)", a, b);
    return 0;
}