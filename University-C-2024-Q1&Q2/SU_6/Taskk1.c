#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main(){
    /*  
        Стол – 13,99; 
        Маса за 8 човека – 42.00; 
        комплект от 6 чаши – 5,98; 
        комплект от 6 чинии с прибори – 21.02.
    */
    int chair_qty = 0, table_qty = 0, cups_bundle_qty = 0, 
    plates_with_utensils_bundle_qty = 0, guests = 0, 
    additional_chairs = 0, additional_tables = 0, additional_cups = 0, additional_plates = 0;

    double chair_price = 13.99, table_price = 42.00, 
    cup_bundle = 5.98, plate_and_utensils_bundle = 21.02, overall_spent = 0;

    char item[64];

    printf("Enter number of guests: ");
    scanf("%d", &guests);
    while(1){
        printf("Enter bought items: ");
        scanf("%s", &item);
        if(strcmp(item, "PARTY!") == 0){
            printf("Overall money spent: %.2lf", overall_spent);
            while(1){
                if(chair_qty < guests || table_qty < guests || cups_bundle_qty < guests || plates_with_utensils_bundle_qty < guests){
                    if(chair_qty < guests){
                    additional_chairs += 1;
                    chair_qty += 1;
                    };
                    if(table_qty < guests){
                        additional_tables += 1;
                        table_qty += 8;
                    };
                    if(cups_bundle_qty < guests){
                        additional_cups += 1;
                        cups_bundle_qty += 6;
                    };
                    if(plates_with_utensils_bundle_qty < guests){
                        additional_plates += 1;
                        plates_with_utensils_bundle_qty += 6;
                    };
                }
                else{
                    break;
                }
            }
            if(additional_chairs != 0){
                printf("\n%d Chair/s", additional_chairs);
            }
            if(additional_tables != 0){
                printf("\n%d Table/s", additional_tables);
            }
            if(additional_cups != 0){
                printf("\n%d Cup/s", additional_cups);
            }
            if(additional_plates != 0){
                printf("\n%d Dishe/s", additional_plates);
            }
            break;
        }
        for (int i = 0; item[i] != '\0'; i++) {
            item[i] = tolower(item[i]);
        }

        if (item != NULL){
            item[0] = toupper(item[0]);
        }


        if(strcmp(item, "Chair") == 0){
            chair_qty += 1;
            overall_spent += chair_price;
        }

        else if(strcmp(item, "Table") == 0){
            table_qty += 8;
            overall_spent += table_price;
        }

        else if(strcmp(item, "Cups") == 0){
            cups_bundle_qty += 6;
            overall_spent += cup_bundle;
        }
        
        else if(strcmp(item, "Dishes") == 0){
            plates_with_utensils_bundle_qty += 6;
            overall_spent += plate_and_utensils_bundle;
        }
        else{
            printf("Invalid item!");
        }
    }
    return 0;
}