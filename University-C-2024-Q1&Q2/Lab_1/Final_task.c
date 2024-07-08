#include <stdio.h>

int main(){
    int a = 10, b = 4, y1;
    // a & b = 0 (decimal)
    // 1010 & 0100 = 0000
    //y1 = aa&bb;  
    //y1 = 0b000

    printf("a & b = %d\n", a&b);
    printf("a | b = %d\n", a|b);
    printf("~ a = %d\n", ~a);
    printf("a ^ b = %d\n", a^b);

    int aa = 10, bb = -10;
    printf("aa >> 1 = %d\n", aa>>1);
    printf("bb >> 1 = %d\n", bb>>1);

    int aaa = 10, bbb = -10;
    printf("aaa << 1 = %d\n", aa<<1);
    printf("aaa << 2 = %d\n", aa<<2);
    printf("bbb << 1 = %d\n", bb<<1);
    printf("bbb << 2 = %d\n", bb<<2);
    return 0;
}