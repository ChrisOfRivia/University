#include <stdio.h>

void xOR(int *a){
    int binB;
    printf("Enter binary num: ");
    scanf("%d", &binB);
    *a = binB ^ *a;                
}                                          

int main(){
    int binA;
    printf("Enter binary num: ");
    scanf("%d", &binA);
    xOR(&binA);
    printf("XOR = %d", binA);
    return 0;
}