#include <stdio.h>
#include <math.h>
#include "Tasks.h"

void fcTask6(void)
{
    int x, y, x1, y1, x2, y2;

    printf("Enter coordinates of dot: ");
    scanf("%d %d", &x, &y);

    printf("Enter coordinates of rectangle: ");
    scanf("%d %d %d %d", &x1, &y1, &x2, &y2);

    ((x >= x1 && x <= x2) && (y >= y1 && y <= y2)) ? printf("Inside") : printf("Outside");
    return 0;
}
