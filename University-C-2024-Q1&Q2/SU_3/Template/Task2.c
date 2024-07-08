#include <stdio.h>
#include <math.h>
#include "Tasks.h"

void fcTask2(void)
{
    int hours, minutes;
    printf("Enter hours and minutes: ");
    scanf("%d %d", &hours, &minutes);
    if(0 <= hours <= 24 || 0 <= minutes <= 59){
        minutes += 15;
        if(minutes > 59){
            minutes = fabs(60 - minutes);
            hours += 1;
            if(hours > 23){
                hours = 0;
            }
        }
        if(minutes < 10){
            printf("%d:%02d", hours, minutes);
        }
        else{
            printf("%d:%d", hours, minutes);
        }
    }
    else{
        printf("Invalid time!");
    }
    return 0;
}
