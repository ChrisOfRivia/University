#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <time.h>

typedef struct Point {
    int coordinates[3];
} Point;

double distance(Point p1, Point p2) {
    return sqrt(pow(p2.coordinates[0] - p1.coordinates[0], 2) +
                pow(p2.coordinates[1] - p1.coordinates[1], 2) +
                pow(p2.coordinates[2] - p1.coordinates[2], 2));
}

int getRandomCoord() {
    return rand() % 10;
}

int main() {
    srand(time(0)); 

    Point point1, point2, point3;

    point1.coordinates[0] = getRandomCoord();
    point1.coordinates[1] = getRandomCoord();
    point1.coordinates[2] = getRandomCoord();
    if(point1.coordinates[0] == point1.coordinates[1] || point1.coordinates[0] == point1.coordinates[2]
    || point1.coordinates[1] == point1.coordinates[2]){
        printf("Invalid coordinates for A!");
        return 1;
    }

    point2.coordinates[0] = getRandomCoord();
    point2.coordinates[1] = getRandomCoord();
    point2.coordinates[2] = getRandomCoord();
    if(point2.coordinates[0] == point2.coordinates[1] || point2.coordinates[0] == point2.coordinates[2]
    || point2.coordinates[1] == point2.coordinates[2]){
        printf("Invalid coordinates for B!");
        return 1;
    }

    point3.coordinates[0] = getRandomCoord();
    point3.coordinates[1] = getRandomCoord();
    point3.coordinates[2] = getRandomCoord();
    if(point3.coordinates[0] == point3.coordinates[1] || point3.coordinates[0] == point3.coordinates[2]
    || point3.coordinates[1] == point3.coordinates[2]){
        printf("Invalid coordinates for C!");
        return 1;
    }

    double side1 = distance(point1, point2);
    double side2 = distance(point2, point3);
    double side3 = distance(point3, point1);

    printf("Side 1: %.2f\n", side1);
    printf("Side 2: %.2f\n", side2);
    printf("Side 3: %.2f\n", side3);

    if (side1 > 0 && side2 > 0 && side3 > 0) {
        if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2) {
            printf("Triangle exists!\n");
        } else {
            printf("Triangle does not exist! Check sides length.\n");
        }
    } else {
        printf("Triangle does not exist! One or more sides have length zero.\n");
    }

    return 0;
}
