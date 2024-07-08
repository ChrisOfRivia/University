// #include <stdio.h>
// #include <stdlib.h>

// int main(){
//     int N, num;
//     printf("Enter NxN: ");
//     scanf("%d", &N);
//     int main_arr[N][N];  <---- PROBLEM FOR NOT CONSTANT VALUE !!!!!!!!

//     for(int i = 0; i < N; i++){
//         for(int j = 0; j < N; j++){
//             scanf("%d", &main_arr[i][j]);
//         }
//     }
    
//     printf("Main diagonal");
//     for(int i = 0; i < N; i++){
//         printf(" %d ", main_arr[i][i]);
//     }
//     printf("\n");


//     printf("Secondary diagonal");
//     for(int i = 0; i < N; i++){
//         printf(" %d ", main_arr[i][N-1-i]);
//     }
//     printf("\n");


//     printf("Above main diagonal");
//     for(int i = 0; i < N; i++){
//         for(int j = 0; j < N; j++){
//             if(i < j){
//                 printf(" %d ", main_arr[i][j]);
//             }
//         }
//     }
//     printf("\n");
//     printf("Below main diagonal");
//     for(int i = 0; i < N; i++){
//         for(int j = 0; j < N; j++){
//             if(i > j){
//                 printf(" %d ", main_arr[i][j]);
//             }
//         }
//     }
//     printf("\n");
//     return 0;
// }