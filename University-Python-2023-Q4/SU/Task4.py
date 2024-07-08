def multiplicationA():
    numbers = []
    while True:
        try:
            num = float(input(f"Enter num ({len(numbers) + 1}): "))
            if num == 0:
                break
            numbers.append(num)
        except ValueError:
            print("Invalid number")

    sum = 1
    for num in numbers:
        sum *= num

    return sum


def multiplicationB(*args):
    sum = 1
    for num in args:
        sum *= num

    return sum


def multiplicationC(numbers):
    sum = 1
    for num in numbers:
        sum *= num

    return numbers


def Funct(numbers=(2, 3, 4)):
    result = multiplicationC(numbers)
    return 0.5 * result


print(multiplicationA())
print(multiplicationB(1, 2, 3, 4))

result1 = Funct((1, 2, 3))
print(f"Резултат 1: {result1}")

result2 = Funct((4, 5, 6, 7))
print(f"Резултат 2: {result2}")