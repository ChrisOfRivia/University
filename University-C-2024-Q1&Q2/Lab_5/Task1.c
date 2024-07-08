#include <stdio.h>


int main(){
    char string[255];
    int counter = 0;

    printf("Enter string: ");
    scanf("%s", &string);
    while(string[counter] != '\0'){
        counter ++;
    }

    printf("%d", counter);
    return 0;
}