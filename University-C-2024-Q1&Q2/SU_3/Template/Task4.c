#include <stdio.h>
#include "Tasks.h"

void fcTask4(void)
{
    int points;
    double bonus;

    printf("Enter points: ");
    scanf("%d", &points);

    if(points <= 100){
        bonus = 5;
    }
    else if(points <= 1000){
        bonus = points * 0.20;
    }
    else{
        bonus = points * 0.10;
    }

    if(points % 2 == 0){
        bonus += 1;
    }
    if(points % 10 == 5){
        bonus += 2;
    }

    printf("Bonus: %.2lf\n", bonus);
    printf("All points: %.2lf", bonus + points);
    return 0;
}
