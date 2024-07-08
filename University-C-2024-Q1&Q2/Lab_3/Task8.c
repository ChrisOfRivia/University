#include <stdio.h>

void squareArea(float* area){
    float squareSide;
    printf("Enter side of square: ");
    scanf("%f", &squareSide);
    *area =  squareSide * squareSide;
}

void rectangleArea(float* area){
    float rectangleA, rectangleB;
    printf("Enter sides of rectangle: ");
    scanf("%f %f", &rectangleA, &rectangleB);
    *area = rectangleA * rectangleB;

}

void rightTriangleArea(float* area){
    float triangleA, triangleB;
    printf("Enter sides of triangle: ");
    scanf("%f %f", &triangleA, &triangleB);
    *area = (triangleA * triangleB) / 2;
}

void circleArea(float* area){
    float circleDiameter;
    printf("Enter diameter of a circle ");
    scanf("%f", &circleDiameter);
    *area = (circleDiameter * 3.14);
}

int main(){
    int a;
    float area;
    printf("Enter 1-4: ");
    scanf(" %d", &a);
    switch (a){
        case 1:
            squareArea(&area);
            printf("Shape: Square\nArea: %.2f", area);
            break;
        case 2:
            rectangleArea(&area);
            printf("Shape: Rectangle\nArea: %.2f", area);
            break;
        case 3:
            rightTriangleArea(&area);
            printf("Shape: Right Triangle\n Area: %.2f", area);
            break;
        case 4:
            circleArea(&area);
            printf("Shape: Circle\n Area: %.2f", area);
            break;
        default:
            printf("No such shape!");
    }
    return 0;
}