# приема 2 числа и извършва делене

def division_of_two_numbers(num1, num2):
    division = num1 / num2
    return division


try:
    a = float(input("a: "))
except ValueError:
    print(f'First variable must be a number!\n')

try:
    b = float(input("b: "))
except ValueError:
    print(f'Second variable must be a number!\n')

try:
    print(division_of_two_numbers(a, b))
except ZeroDivisionError:
    print(f'Second number cannot be a 0\n')
except NameError:
    print(f'Function expects 2 valid parameters!\n')
