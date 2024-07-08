#include <stdio.h>
#include "Tasks.h"

void fcTask5(void)
{
    int runner1, runner2, runner3, sum_time_seconds, minutes, seconds;
    printf("Enter time for 3 runners: ");
    scanf("%d %d %d", &runner1, &runner2, &runner3);

    sum_time_seconds = runner1 + runner2 + runner3;
    minutes = sum_time_seconds / 60;
    seconds = sum_time_seconds % 60;

    (seconds < 10) ? printf("%d:%02d", minutes, seconds) : printf("%d:%d", minutes,seconds);

    return 0;
}
