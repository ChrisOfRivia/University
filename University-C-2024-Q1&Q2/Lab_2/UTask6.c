#include <stdio.h>

int main(){
    double num1, num2;
    printf("Enter two real numbers: ");
    scanf("%lf %lf", &num1, &num2);

    for(double i = num1 + 0.01; i < num2; i += 0.01){
        double result = i * i - 4;
        printf("%lf ", result);
    }
    return 0;
}