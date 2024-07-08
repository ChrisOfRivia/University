#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void printMatrix(float matrix[13][4]){
    for(int i = 0; i < 13; i++){
        for(int j = 0; j < 4; j++){
            printf("%.1f ", matrix[i][j]);
        }
        printf("\n");
    }
}


int main(){
    srand(time(NULL));
    float cards[13][4] = {
        {2.0, 2.1, 2.2, 2.3},
        {3.0, 3.1, 3.2, 3.3},
        {4.0, 4.1, 4.2, 4.3},
        {5.0, 5.1, 5.2, 5.3},
        {6.0, 6.1, 6.2, 6.3},
        {7.0, 7.1, 7.2, 7.3},
        {8.0, 8.1, 8.2, 8.3},
        {9.0, 9.1, 9.2, 9.3},
        {10.0, 10.1, 10.2, 10.3},
        {11.0, 11.1, 11.2, 11.3},
        {12.0, 12.1, 12.2, 12.3},
        {13.0, 13.1, 13.2, 13.3},
        {14.0, 14.1, 14.2, 14.3}
    };

    printMatrix(cards);
    printf("\n");

    for(int i = 0; i < 52; i++){
        int row1 = rand() % 13;
        int coll1 = rand() % 4;
        int row2 = rand() % 13;
        int coll2 = rand() % 4;

        // printf("Random element 1: [%d][%d]\n", row1, coll1);
        // printf("Random element 2: [%d][%d]\n", row2, coll2);

        double temp = cards[row1][coll1];
        cards[row1][coll1] = cards[row2][coll2];
        cards[row2][coll2] = temp;
    }
    printMatrix(cards);

    for(int i = 0; i < 8; i++){
        if(i % 2 == 0){
            printf("\nPlayer [%d]\n", 1 + i / 2);
        }
        for(int j = 0; j < 4; j++){
            printf("%.1f ", cards[i][j]);
        }
        

    }
}