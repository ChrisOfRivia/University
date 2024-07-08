#include <stdio.h>

void squareArea(){
    float squareSide;
    printf("Enter side of square: ");
    scanf("%f", &squareSide);
    float areaSquare =  squareSide * squareSide;
    printf("Shape: Square\nArea: %.2f", areaSquare);
}

void rectangleArea(){
    float rectangleA, rectangleB;
    printf("Enter sides of rectangle: ");
    scanf("%f %f", &rectangleA, &rectangleB);
    float areaRectangle = rectangleA * rectangleB;
    printf("Shape: Rectangle\nArea: %.2f", areaRectangle);
}

void rightTriangleArea(){
    float triangleA, triangleB;
    printf("Enter sides of triangle: ");
    scanf("%f %f", &triangleA, &triangleB);
    float areaTriangle = (triangleA * triangleB) / 2;
    printf("Shape: Right Triangle\n Area: %.2f", areaTriangle);
}

void circleArea(){
    float circleDiameter;
    printf("Enter diameter of a circle ");
    scanf("%f", &circleDiameter);
    float areaCircle = (circleDiameter * 3.14);
    printf("Shape: Circle\n Area: %.2f", areaCircle);
}

int main(){
    int a;
    printf("Enter 1-4: ");
    scanf(" %d", &a);
    switch (a){
        case 1:
            squareArea();
            break;
        case 2:
            rectangleArea();
            break;
        case 3:
            rightTriangleArea();
            break;
        case 4:
            circleArea();
            break;
        default:
            printf("No such shape!");
    }
    return 0;
}