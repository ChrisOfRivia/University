#include <stdio.h>

typedef struct Car{
    char brand_and_model[6];
    double engine_volume;
    double price;
    char has_registration;
} Car;

int main(){
    FILE *bfptr, *tfptr;
    Car cars[4];
    
    bfptr = fopen("Cars.bin", "wb");
    Car car1 = {"AU A3", 1900, 8000, 'Y'};
    Car car2 = {"AU A3", 2000, 7500, 'N'};
    Car car3 = {"AU A4", 2200, 7000, 'Y'};
    Car car4 = {"AU A3", 1900, 20000, 'N'};
    cars[0] = car1;
    cars[1] = car2;
    cars[2] = car3;
    cars[3] = car4;
    fwrite(cars, sizeof(Car), 4, bfptr);
    fclose(bfptr);

    tfptr = fopen("Cars.txt", "w");
    for(int i = 0; i < 4; i++){
        fprintf(tfptr, "%s %.2lf %.2lf %c\n", cars[i].brand_and_model, cars[i].engine_volume, cars[i].price, cars[i].has_registration);
    }
    fclose(tfptr);

    bfptr = fopen("Cars.bin", "rb");
    fread(cars, sizeof(Car), 4, bfptr);
    fclose(bfptr);

    tfptr = fopen("Cars.txt", "r");
    printf("Contents of Cars.txt:\n");
    char line[100];
    while (fgets(line, sizeof(line), tfptr) != NULL) {
        printf("%s", line);
    }
    fclose(tfptr);

    return 0;
}
