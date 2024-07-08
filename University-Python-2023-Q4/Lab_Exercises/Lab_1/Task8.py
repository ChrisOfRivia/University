# Calculator za celi chisla
# subirane izvajdane umnojenie i delenie

def sum_numbers(a, b):
    return a + b


def subtract_numbers(a, b):
    return a - b


def divide_numbers(a, b):
    return a / b


operation = input("[+] [-] [/] : ")
a = float(input("a: "))
b = float(input("b: "))

if operation == "+":
    print(f'The sum of {a} and {b} is {sum_numbers(a, b)}')

elif operation == "-":
    print(f'The subtraction of {a} and {b} is {subtract_numbers(a, b)}')

elif operation == "/":
    print(f'The division of {a} and {b} is {divide_numbers(a, b)}')
