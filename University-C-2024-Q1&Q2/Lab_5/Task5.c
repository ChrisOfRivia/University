#include <stdio.h>

int main(){
    char string[255];
    int vowel_count = 0;
    printf("Enter word: ");
    fgets(string, 255, stdin);
    for (int i = 0; string[i] != '\0'; i++) {
        if(string[i] == 'a' || string[i] == 'e' ||
        string[i] == 'i' || string[i] == 'o' || string[i] == 'u' ||
        string[i] == 'A' || string[i] =='E' || string[i] == 'I' ||
        string[i] == 'O' || string[i] == 'U'){
            vowel_count ++;
        }
    }
    printf("%d", vowel_count);
    return 0;
}