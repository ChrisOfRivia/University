#include <stdio.h>

int main() {
    char string1[50], string2[50];
    int ascii_str1 = 0, ascii_str2 = 0;

    printf("Enter string one: ");
    fgets(string1, 50, stdin);
    for (int i = 0; string1[i] != '\0'; i++) {
        ascii_str1 += (int)string1[i];
    }
    printf("Enter string two: ");
    fgets(string2, 50, stdin);
    for (int j = 0; string2[j] != '\0'; j++) {
        ascii_str2 += (int)string2[j];
    }

    printf("%d\n", ascii_str1);
    printf("%d\n", ascii_str2);

    if (ascii_str1 == ascii_str2) {
        printf("Same!\n");
    } else {
        printf("Not same!\n");
    }
    return 0;
}
