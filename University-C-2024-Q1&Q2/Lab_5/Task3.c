#include <stdio.h>

int main() {
    char str[255];
    int count[26] = {0}; 

    printf("Enter string: ");
    fgets(str, 255, stdin);

    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] >= 'a' && str[i] <= 'z') {
            count[str[i] - 'a']++; 
        } else {
            count[str[i] - 'A']++; 
        }
        }

    printf("Number letters:\n");
    for (int i = 0; i < 26; i++) {
        if (count[i] > 0) {
            printf("%c: %d\n", 'a' + i, count[i]);
        }
    }

    return 0;
}
