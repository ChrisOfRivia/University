from Lab_4.area_figures import figures_module_1 as fig1, figures_module_2 as fig2

figure = input('Input figure: ')

if figure.upper() == 'TRIANGLE':
    a = float(input("a: "))
    h = float(input('h: '))
    print(fig1.triangle_area(a, h))

elif figure.upper() == 'SQUARE':
    a = float(input('a: '))
    print(fig1.square_area(a))

elif figure.upper() == 'RECTANGLE':
    a = float(input('a: '))
    b = float(input('b: '))
    print(fig1.rectangle_area(a, b))

elif figure.upper() == 'RHOMBUS':
    a = float(input('a: '))
    h = float(input('h: '))
    print(fig2.rhombus_area(a, h))

elif figure.upper() == 'TRAPEZOID':
    a = float(input('a: '))
    b = float(input('b: '))
    h = float(input('h: '))
    print(fig2.trapezoid_area(a, b, h))
