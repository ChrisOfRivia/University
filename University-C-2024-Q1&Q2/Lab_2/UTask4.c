#include <stdio.h>

int main(){
    int N, K, counter;
    printf("Enter N and K: ");
    scanf("%d %d", &N, &K);

    for(int i = 1; i <= N; i++){
        int new_num;
        printf("[%d] Enter a number: ", i);
        scanf("%d", &new_num);

        if(new_num > K && new_num % 3 == 0){
            counter++;
        }
    }
    printf("%d", counter);
    return 0;
}