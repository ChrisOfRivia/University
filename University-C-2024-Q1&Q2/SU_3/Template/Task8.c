#include <stdio.h>
#include "Tasks.h"

void fcTask8(void)
{
    double V, tube1, tube2, current_size;
    int N;

    printf("Enter volume of pool: ");
    scanf("%lf", &V);

    printf("Enter debit of the two tubes: ");
    scanf("%lf %lf", &tube1, &tube2);

    printf("Enter hours gone: ");
    scanf("%d", &N);


    for(int i = 1; i <= N; i++){

        current_size += (tube1 + tube2);
        if(current_size >= V){
            current_size = V;
        }
        printf("Hour [%d] -> %.2lf/%.2lf\n", i, current_size, V);
    }
    return 0;
}
