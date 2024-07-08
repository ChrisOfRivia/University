// #include <stdio.h>
// #include <stdlib.h>

// int main(){
//     int N, sum_diag = 0, sum_sec_diag = 0, sum_rows = 0, sum_collumns = 0;
//     printf("Enter NxN: ");
//     scanf("%d", &N);
//     int main_arr[N][N];   <---- PROBLEM FOR NOT CONSTANT VALUE !!!!!!!!

//     for(int i = 0; i < N; i++){
//         for(int j = 0; j < N; j++){
//             scanf("%d", &main_arr[i][j]);
//         }
//     }

//     //Sum main diag
//     for(int i = 0; i < N; i++){
//         sum_diag += main_arr[i][i];
//     }

//     // Sum secondary diag
//     for(int i = 0; i < N; i++){
//         sum_sec_diag += main_arr[i][N-1-i];
//     }

//     // Sum all rows 
//     for(int i = 0; i < N; i++){
//         int sum_row = 0;
//         for(int j = 0; j < N; j++){
//             sum_row += main_arr[i][j];
//         }
//         sum_rows += sum_row;
//     }
//     sum_rows /= N;

//     // Sum all collumns
//     for(int i = 0; i < N; i++){
//         int sum_coll = 0;
//         for(int j = 0; j < N; j++){
//             sum_coll += main_arr[j][i];
//         }
//         sum_collumns += sum_coll;
//     }
//     sum_collumns /= N;

//     printf("%d\n", sum_diag);
//     printf("%d\n", sum_sec_diag);
//     printf("%d\n", sum_collumns);
//     printf("%d\n", sum_rows);

//     if(sum_diag == sum_sec_diag && sum_diag == sum_collumns && sum_diag == sum_rows){
//         printf("Magical square!");
//     }
//     else{
//         printf("Not a magical square.");
//     }
// }