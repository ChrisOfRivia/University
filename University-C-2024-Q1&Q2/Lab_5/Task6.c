#include <stdio.h>

int main(){
    char string[255];
    printf("Enter word: ");
    fgets(string, 255, stdin);

    for (int i = 0; string[i] != '\0'; i++) {
        if(string[i] >= 'a' && string[i] <= 'z'){
            string[i] = string[i] - 32;
        }
    }

    printf("%s", string);
    return 0;

}