import math


def circle_parameter_area(radius):
    parameter = 2 * math.pi * radius
    area = math.pi * radius ** 2
    return (f'P= {parameter}\n'
            f'S= {area}')


def rectangle_parameter_area(a, b):
    parameter = 2 * (a + b)
    area = a * b
    return (f'P= {parameter}\n'
            f'S= {area}')


def square_parameter_area(a):
    parameter = 4 * a
    area = a * a
    return (f'P= {parameter}\n'
            f'S= {area}')


def triangle_parameter_area(a, b, c, ha):
    parameter = a + b + c
    area = (a * ha) / 2
    return (f'P= {parameter}\n'
            f'S= {area}')


def trapezoid_parameter_area(a, b, c, d, h):
    parameter = a + b + c + d
    area = ((a + b) * h) / 2
    return (f'P= {parameter}\n'
            f'S= {area}')


def parallelogram_parameter_area(a, b, ha):
    parameter = 2 * (a + b)
    area = a * ha
    return (f'P= {parameter}\n'
            f'S= {area}')


figure = input('Input a geometrical figure: ')
if figure.upper() == 'CIRCLE':
    r = float(input('r: '))
    print(circle_parameter_area(r))
elif figure.upper() == 'RECTANGLE':
    a = float(input('a: '))
    b = float(input('b: '))
    print(rectangle_parameter_area(a, b))
elif figure.upper() == 'SQUARE':
    a = float(input('a: '))
    print(square_parameter_area(a))
elif figure.upper() == 'TRIANGLE':
    a = float(input('a: '))
    b = float(input('b: '))
    c = float(input('c: '))
    ha = float(input('ha: '))
    print(triangle_parameter_area(a, b, c, ha))
elif figure.upper() == 'TRAPEZOID':
    a = float(input('a: '))
    b = float(input('b: '))
    c = float(input('c: '))
    d = float(input('d: '))
    h = float(input('h: '))
    print(trapezoid_parameter_area(a, b, c, d, h))
elif figure.upper() == 'PARALLELOGRAM':
    a = float(input('a: '))
    b = float(input('b: '))
    ha = float(input('ha: '))
    print(parallelogram_parameter_area(a, b, ha))
