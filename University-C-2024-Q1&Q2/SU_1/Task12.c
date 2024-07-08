#include <stdio.h>

int main(){
    float x_A, x_B, x_C, y_A, y_B, y_C, area;

    printf("Enter X and Y for point A: ");
    scanf("%f %f", &x_A, &y_A);
    printf("Enter X and Y for point B: ");
    scanf("%f %f", &x_B, &y_B);
    printf("Enter X and Y for point C: ");
    scanf("%f %f", &x_C, &y_C);

    area = fabs((x_A*(y_B - y_C) + x_B*(y_C - y_A) + x_C*(y_A - y_B))) / 2;
    printf("%.2f", area);


    return 0;
}