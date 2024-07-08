def func(name='Jack', age=18):
    name = 'Jane'
    age = 19
    return name, age


def func2(height=1.50, gender='M'):
    height = 1.80
    gender = 'F'
    return height, gender


print(func())
print(func2())
