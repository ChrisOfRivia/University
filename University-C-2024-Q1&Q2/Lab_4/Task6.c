#include <stdio.h>
#include <math.h>

double median_time(double* nums, int size) {
    double sum = 0;
    for (int i = 0; i < size; i++) {
        sum += nums[i];
    }
    return sum / size;
}

double sum_of_random_errors_and_powers(double* nums, int size, double median) {
    double errors, squares, sum_all = 0;
    for (int j = 0; j < size; j++) {
        errors = nums[j] - median;
        squares = pow(errors, 2);
        sum_all += squares;
    }
    return sum_all;
}

int main() {
    double t[10] = {41.0, 43.4, 48.8, 49.2, 50.1, 44.6, 47.3, 46.8, 43.9, 46.4};

    double average = median_time(t, 10);
    printf("Median: %.2lf\n", average);

    double sum_all = sum_of_random_errors_and_powers(t, 10, average);
    double standard_deviation = sqrt(sum_all / 10);
    printf("Standard Deviation: %.2lf\n", standard_deviation);

    return 0;
}
