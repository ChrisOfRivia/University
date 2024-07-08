#include <stdio.h>
#include <ctype.h>
#include <string.h>

typedef struct Product {
    char name[64];
    double price;
    int ID;
} Product;

typedef struct Order {
    char address[256];
    int product_ID;
} Order;

void create_product(Product products[], int *product_count) {
    char name[64];
    double price;
    int ID;

    printf("Name of product: ");
    scanf("%s", name);

    printf("Enter price of product: ");
    scanf("%lf", &price);

    printf("Enter ID of product: ");
    scanf("%d", &ID);

    Product new_product;
    strcpy(new_product.name, name);
    new_product.price = price;
    new_product.ID = ID;

    products[(*product_count)++] = new_product;
}

int find_product(Product products[], int product_count, int product_ID) {
    for (int i = 0; i < product_count; ++i) {
        if (products[i].ID == product_ID) {
            return i; 
        }
    }
    return -1; 
}

int main() {
    char command[64];
    int product_count = 0;
    int order_count = 0;
    Product products[64];
    Order orders[64];

    while (1) {
        printf("Command: ");
        scanf("%s", command);
        for (int i = 0; command[i] != '\0'; i++) {
            command[i] = toupper(command[i]);
        }

        if (strcmp(command, "END") == 0) {
            break;
        }

        if (strcmp(command, "PRODUCT") == 0) {
            create_product(products, &product_count);
            for (int i = 0; i < order_count; ++i) {
                int index = find_product(products, product_count, orders[i].product_ID);
                if (index != -1) {
                    printf("Client %s ordered %s\n", orders[i].address, products[index].name);
                    for (int j = i; j < order_count - 1; ++j) {
                        orders[j] = orders[j + 1];
                    }
                    order_count--;
                }
            }
        } else if (strcmp(command, "ORDER") == 0) {
            char address[256];
            int product_ID;
            printf("Enter address: ");
            scanf("%s", address);

            printf("Enter product ID: ");
            scanf("%d", &product_ID);

            int index = find_product(products, product_count, product_ID);
            if (index != -1) {
                printf("Client %s ordered %s\n", address, products[index].name);
            } else {
                printf("Product not found. Order placed in queue.\n");
                strcpy(orders[order_count].address, address);
                orders[order_count].product_ID = product_ID;
                order_count++;
            }
        }
    }
    return 0;
}
