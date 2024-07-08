#include <stdio.h>

int main(){
    int num1, num2, higher_number, lower_number, sum = 0;
    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);

    if(num1 > num2){
        higher_number = num1;
        lower_number = num2;
    }
    else{
        higher_number = num2;
        lower_number = num1;
    }

    for(lower_number++; lower_number < higher_number; lower_number++){
        sum += lower_number;
    }

    printf("%d", sum);
    return 0;
}