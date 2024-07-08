#include <stdio.h>

typedef struct Student {
    char name[25];
    double grade;
} Student;

typedef struct Class {
    char name[25];
    Student *students[30];
    int num_students;
    double average_class_grade;
} Class;

int main() {
    double sum1 = 0.0, sum2 = 0.0, sum3 = 0.0, average = 0.0;
    Student students[] = {
        {"Dragomir", 4.0},
        {"Petko", 3.0},
        {"Yana", 5.0},
        {"Sevda", 3.2},
        // 12A ^
        {"Vasilka", 3.0},
        {"Momchil", 6.0},
        {"Dimana", 5.3},
        {"Lubka", 3.4},
        {"Genadi", 4.7},
        {"Dafinka", 3.3},
        // 12B ^
        {"Peyo", 5.6},
        {"Dimo", 5.2},
        {"Evgeniya", 4.3},
        {"Savina", 6.0},
        {"Lilyana", 5.4},
        {"Bilyana", 4.8},
        {"Bojurka", 4.7},
    };



    Class a12 = {"12A", {&students[0], &students[1], &students[2], &students[3]}, 4, 0.0};
    Class b12 = {"12B", {&students[4], &students[5], &students[6], &students[7], &students[8], &students[9]}, 6, 0.0}; 
    Class v12 = {"12V", {&students[10], &students[11], &students[12], &students[13], &students[14], &students[15], &students[16]}, 7, 0.0}; 

    for (int i = 0; i < a12.num_students; ++i) {
        sum1 += a12.students[i]->grade;
    }
    a12.average_class_grade = sum1 / a12.num_students;

    for (int i = 0; i < b12.num_students; ++i) {
        sum2 += b12.students[i]->grade;
    }
    b12.average_class_grade = sum2 / b12.num_students;

    for (int i = 0; i < v12.num_students; ++i) {
        sum3 += v12.students[i]->grade;
    }
    v12.average_class_grade = sum3 / v12.num_students;

    average = (a12.average_class_grade + b12.average_class_grade + v12.average_class_grade) / 3;

    printf("\nClass: %s\n", a12.name);
    printf("Number of students: %d\n", a12.num_students);
    printf("Average class grade: %.2f\n", a12.average_class_grade);
    printf("Grades above 5.50: ");
    for (int i = 0; i < a12.num_students; ++i) {
        if(a12.students[i]->grade > 5.5){
            printf(a12.students[i]->name);
            printf(" ");
        };
    }
    printf("\n");

    printf("\nClass: %s\n", b12.name);
    printf("Number of students: %d\n", b12.num_students);
    printf("Average class grade: %.2f\n", b12.average_class_grade);
    printf("Grades above 5.50: ");
    for (int i = 0; i < b12.num_students; ++i) {
        if(b12.students[i]->grade > 5.5){
            printf(b12.students[i]->name);
            printf(" ");
        };
    }
    printf("\n");

    printf("\nClass: %s\n", v12.name);
    printf("Number of students: %d\n", v12.num_students);
    printf("Average class grade: %.2f\n", v12.average_class_grade);
    printf("Grades above 5.50: ");
    for (int i = 0; i < v12.num_students; ++i) {
        if(v12.students[i]->grade > 5.5){
            printf(v12.students[i]->name);
            printf(", ");
        };
    }
    printf("\n");

    printf("\nAverage grade from all classes: %.2f", average);
    return 0;
}
