from Lab_4.operations import operations_1 as op1, operations_2 as op2

ask = input('Operation ([+] | [-] | [/] | [*]): ')
num1 = int(input('Number 1: '))
num2 = int(input('Number 2: '))

if ask == '+':
    print(op1.adding(num1, num2))
elif ask == '-':
    print(op1.subtraction(num1, num2))
elif ask == '*':
    print(op2.multiplication(num1, num2))
elif ask == '/':
    print(op2.division(num1, num2))

