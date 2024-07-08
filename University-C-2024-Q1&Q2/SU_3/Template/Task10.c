#include <stdio.h>
#include "Tasks.h"

void fcTask10(void)
{
    /*
    Numbers 1 - 1000
    p1 -> 0 - 199
    p2 -> 200 - 399
    p3 -> 400 - 599
    p4 -> 600 - 799
    p5 -> 800 - 1000
    */

    int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, n, number;
    printf("Enter number of integers: ");
    scanf("%d", &n);

    for(int i = 1; i <= n; i++){
        printf("Number [%d]: ", i);
        scanf("%d", &number);
        if(number < 200){
            p1 += 1;
        }
        else if(number >= 200 && number < 400){
            p2 += 1;
        }
        else if(number >= 400 && number < 600){
            p3 += 1;
        }
        else if(number >= 600 && number < 800){
            p4 += 1;
        }
        else if(number >= 800 && number <= 1000){
            p5 += 1;
        }
    }     

    printf("All numbers count: %d\n", n);
    printf("P1 -> %.2f%%\n", (p1 / (float)n) * 100);
    printf("P2 -> %.2f%%\n", (p2 / (float)n) * 100);
    printf("P3 -> %.2f%%\n", (p3 / (float)n) * 100);
    printf("P4 -> %.2f%%\n", (p4 / (float)n) * 100);
    printf("P5 -> %.2f%%\n", (p5 / (float)n) * 100);

    return 0;
}
