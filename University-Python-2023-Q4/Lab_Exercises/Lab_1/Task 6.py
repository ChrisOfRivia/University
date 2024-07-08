def area_of_square(a):
    return a * a


def area_of_rectangle(a, b):
    return a * b


def area_of_right_triangle(a, b):
    return (a * b) / 2


def area_of_a_triangle(a, b, h):
    return ((a * b) / 2) * h


figure = input('Triangle | Rectangle | Square | RightTriangle: ')

if figure.upper() == "SQUARE":
    a = float(input("a: "))
    area = area_of_square(a)
    print(f'Area of a Sqaure is {area}')

elif figure.upper() == 'RECTANGLE':
    a = float(input("a: "))
    b = float(input("b: "))
    area = area_of_rectangle(a, b)
    print(f'Area of a Rectangle is {area}')

elif figure.upper() == 'RIGHTTRIANGLE':
    a = float(input("a: "))
    b = float(input("b: "))
    area = area_of_right_triangle(a, b)
    print(f'Area of a Right Triangle is {area}')

elif figure.upper() == 'TRIANGLE':
    a = float(input("a: "))
    b = float(input("b: "))
    h = float(input("h: "))
    area = area_of_a_triangle(a, b, h)
    print(f'Area of a Triangle is {area}')
