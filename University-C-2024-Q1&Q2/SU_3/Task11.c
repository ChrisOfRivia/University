#include <stdio.h>

void upper(int width, int height,int tower_width, int underlines){
    //first tower
    printf("/");
    for (int i = 0; i < tower_width; i++){
        printf("^");  
    }
    printf("\\");

    for (int i = 0; i < underlines; i++){
        printf("_");
    }
    
    //second tower
    printf("/");
    for (int i = 0; i < tower_width; i++){
        printf("^");  
    }
    printf("\\\n");
}

void mid(int width, int height){
    for (int i = 0; i < height-3; i++){
        printf("|");  
        for (int j = 0; j < width-2; j++){
            printf(" ");
        }
        printf("|\n");  
    }
    
}

void mid_last_line(int width, int height,int tower_width, int underlines){
    printf("|");
    for (int i = 0; i < tower_width + 1; i++){
        printf(" ");  
    }

    for (int i = 0; i < underlines; i++){
        printf("_");
    }
    
    for (int i = 0; i < tower_width + 1; i++){
        printf(" ");  
    }
    printf("|\n");
}

void last(int width, int height,int tower_width, int underlines){
    //first tower
    printf("\\");
    for (int i = 0; i < tower_width; i++){
        printf("_");  
    }
    printf("/");

    for (int i = 0; i < underlines; i++){
        printf(" ");
    }
    
    //second tower
    printf("\\");
    for (int i = 0; i < tower_width; i++){
        printf("_");  
    }
    printf("/\n");
}

int main(){
    int n, width, height, tower_width,underlines;
    printf("N: ");
    scanf("%d", &n);

    width = 2 * n;
    height = n;
    tower_width = n / 2;
    underlines = width - 2*(tower_width+2);

    upper(width,height,tower_width,underlines);
    mid(width,height);
    mid_last_line(width,height,tower_width,underlines);
    last(width,height,tower_width,underlines);

    return 0;
}