#include <stdio.h>
#include "Tasks.h"

void fcTask12(void)
{
    int n, width, height, center, num_special_characters;
    printf("N: ");
    scanf("%d", &n);

    width = 2 * n - 1;
    height = 2 * (n - 2) + 1;
    center = height / 2 + 1;
    num_special_characters = (width - 3) / 2;


    for(int i = 1; i <= height; i++){
        if(i < center){
            if(i % 2 != 0){
                for(int i = 0; i < num_special_characters; i++){
                    printf("*");
                }
                printf("\\ /");
                for(int j = 0; j < num_special_characters; j++){
                    printf("*");
                }
                printf("\n");
            }
            else if(i % 2 == 0){
                for(int i = 0; i < num_special_characters; i++){
                    printf("-");
                }
                printf("\\ /");
                for(int j = 0; j < num_special_characters; j++){
                    printf("-");
                }
                printf("\n");
            }
        }
        else if(i == center){
            printf("%*s@%*s\n", (width / 2), " ", (width / 2), " ");
        }
        else if(i > center){
            if(i % 2 != 0){
                for(int i = 0; i < num_special_characters; i++){
                    printf("*");
                }
                printf("/ \\");
                for(int j = 0; j < num_special_characters; j++){
                    printf("*");
                }
                printf("\n");
            }
            else if(i % 2 == 0){
                for(int i = 0; i < num_special_characters; i++){
                    printf("-");
                }
                printf("/ \\");
                for(int j = 0; j < num_special_characters; j++){
                    printf("-");
                }
                printf("\n");
            }
        }
    }

    return 0;
}
