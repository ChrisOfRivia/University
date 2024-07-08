#include <stdio.h>

int main(){
    int num_intervals = 0;
    char sentence[255];
    printf("Enter words: ");
    fgets(sentence, 255, stdin);
    printf("%s", sentence);

    int i;
    for (i = 0; sentence[i] != '\0'; i++) {
        if (sentence[i] == ' ') {
            num_intervals++;
        }
    }
    num_intervals++;

    printf("Number of words: %d\n", num_intervals);

    return 0;
    printf("Number of words: %d\n", num_intervals);

    return 0;
}