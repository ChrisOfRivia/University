#include <stdio.h>
#include <stdlib.h>

void add(int *N, int **array){
    int x;
    printf("Number to add: ");
    scanf("%d", &x);

    printf("Adding %d...\n", x);
    (*N)++;
    *array = realloc(*array, (*N) * sizeof(int));

    (*array)[(*N) - 1] = x;
}

void delete(int *N, int **array){
    int x, instances_deleted = 0;
    printf("Instances of what number to delete? ");
    scanf("%d", &x);

    for(int i = 0; i < *N; i++){
        if((*array)[i] == x){
            instances_deleted++;
            for(int j = i; j < (*N) - 1; j++){
                (*array)[j] = (*array)[j + 1];
            }
            (*N)--;
            i--;
        }   
    }

    if(instances_deleted > 0){
        printf("Removed %d instances of %d\n", instances_deleted, x);
        *array = realloc(*array, (*N) * sizeof(int));
    } else {
        printf("%d not found in array!\n", x);
    }
}


void smallest(int **array){
    int x, biggest_num = array[0];
    printf("What is the X-biggest number you want? ");
    scanf("%d", &x);

}

void print(int *array, int *N){
    for(int i = 0; i < (*N); i++){
        printf("%d ", array[i]);
    }
    printf("\n");
}

int main(){
    /*
        add(x) -> adds element to existing
        delete(x) -> removes all these elements
        smallest(x) -> prints x smallest
    */

    int N, num;
    printf("N: ");
    scanf("%d", &N);

    int *array = (int*)malloc(N * sizeof(int));
    for(int i = 0; i < N; i++){
        printf("Number [%d]: ", i);
        scanf("%d", &num);
        array[i] = num;
    }

    print(array, &N);
    add(&N, &array);
    add(&N, &array);
    print(array, &N);
    delete(&N, &array);
    print(array, &N);

    free(array);
    return 0;
}
