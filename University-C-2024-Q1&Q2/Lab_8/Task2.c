#include <stdio.h>

typedef struct Vehicle {
    char name[25];
    char fuel_type[25];
    double average_consumption_per_100;
    double max_speed;
} Vehicle;

typedef struct Transport {
    Vehicle vehicle; 
    double max_weight;
} Transport;

void printTransportData(Transport transports[], int size) {
    printf("| %-20s | %-20s | %-20s | %-20s | %-20s |\n", "Name", "Fuel Type", "Avg. Consumption", "Max Speed", "Max Weight");
    printf("|------------------------------------------------------------------------------------------------------------------|\n");
    for (int i = 0; i < size; ++i) {
        printf("| %-20s | %-20s | %-20.2f | %-20.2f | %-20.2f |\n", transports[i].vehicle.name, 
                                                                  transports[i].vehicle.fuel_type, 
                                                                  transports[i].vehicle.average_consumption_per_100, 
                                                                  transports[i].vehicle.max_speed, 
                                                                  transports[i].max_weight);
    }
}

int main() {
    Transport transports[] = {
        {{"Car", "Gasoline", 8.5, 200}, 1500}, 
        {{"Motorcycle", "Gasoline", 5.0, 250}, 300},
        {{"Boat", "Diesel", 20.0, 80}, 2000},
        {{"Airplane", "Jet fuel", 25.0, 900}, 10000}
    };

    printTransportData(transports, sizeof(transports) / sizeof(transports[0]));

    return 0;
}
