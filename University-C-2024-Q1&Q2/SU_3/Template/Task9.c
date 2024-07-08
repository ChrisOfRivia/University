#include <stdio.h>
#include <math.h>
#include "Tasks.h"

void fcTask9(void)
{
    int X;
    double Y, Z, space_for_wine_making, kg_grapes_available, wine_available, wine_left;

    printf("Enter area of vineyard: ");
    scanf("%d", &X);

    printf("Enter grapes kg per meter: ");
    scanf("%lf", &Y);

    printf("Enter wanted liters wine: ");
    scanf("%lf", &Z);

    space_for_wine_making = X * 0.4;
    kg_grapes_available = space_for_wine_making * Y;
    wine_available = kg_grapes_available / 2.5;
    wine_left = kg_grapes_available - (wine_available * 2.5);

    if(wine_available >= Z){
        printf("Enough grapes available to produce the desired amount of wine.\n");
        if(wine_left > 0){
            printf("Wine left for workers: \n");
        }
        else{
            printf("No wine left for workers!\n");
        }
    }
    else{
        printf("Insufficient grapes available to produce the desired amount of wine.\n");
        printf("%.2lf more liters of wine needed!", fabs(wine_available - Z));
    }

    return 0;
}
