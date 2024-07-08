#include <stdio.h>

int main(){
    int x=15, y, y1, y2;
    y = (x>5)&&(x<=10);
    y1 = (x<4)||(x>12);
    y2 = (x>4)&&(x!=6);

    printf("y = %d\n", y);
    printf("y1 = %d\n", y1);
    printf("y2 = %d\n", y2);
    return 0;
}