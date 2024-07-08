#include <stdio.h>
#include "Tasks.h"

void fcTask7(void)
{
    int n;
    char type_day;
    printf("Enter kilometers and type of day: ");
    scanf("%d %c", &n, &type_day);

    double cost;
    if(n < 20){
        cost = 0.70;
        switch(type_day){
            case 'D':
                cost += 0.79 * n;
            case 'N':
                cost += 0.90 * n;
        }
        printf("Cheapest travel is with a Taxi\n Cost: %.2lf$\n", cost);
    }
    else if(n < 100){
        cost = 0.09 * n;
        printf("Cheapest travel is with a Bus\n Cost: %.2lf$\n", cost);
    }
    else{
        cost = 0.06 * n;
        printf("Cheapest travel is with a Train\n Cost: %.2lf$\n", cost);
    }
    return 0;
}
