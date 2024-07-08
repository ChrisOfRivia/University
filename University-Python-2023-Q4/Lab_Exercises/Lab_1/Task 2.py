import random

long = int(input("How many numbers? "))
numbers = []
numbers_complete = []

for x in range(long):
    numbers.append(random.randrange(100))

for x, num in enumerate(numbers):
    if x % 2 == 0:
        numbers_complete.append(num)
    else:
        sum_of_numbers = numbers[(numbers.index(num) - 1)] + numbers[numbers.index(num)]
        numbers_complete.append(sum_of_numbers)
        numbers_complete.append(num)

print(numbers)
print(numbers_complete)
