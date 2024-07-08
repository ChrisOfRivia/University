def multiplication(num1, num2):
    return f'{num1} * {num2} = {num1 * num2}'


def division(num1, num2):
    if num2 != 0:
        return f'{num1} / {num2} = {num1 / num2}'
    return 'Cannot divide by 0'
