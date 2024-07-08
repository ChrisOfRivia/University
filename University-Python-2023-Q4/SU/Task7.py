def f2(x):
    x = int(input("Enter number: "))
    k = f1(x)
    return k


def f1(x):
    if x == 0:
        print("Number can't be zero")
        y = f2(x)
    else:
        y = 4 * x

    return y


print(f1(0))