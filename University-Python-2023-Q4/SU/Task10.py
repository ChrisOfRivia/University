def f2(binary_num):
    return int(binary_num, base=2)


def f1(pos_num):
    remainders_list = []
    string_remainders = ''
    while pos_num != 0:
        remainder = pos_num % 2
        remainders_list.append(remainder)
        string_remainders += str(remainder)
        pos_num //= 2

    print(f'Числото от десетична в двоична бройна система е: {string_remainders[::-1]}')
    ask = input(f'Желаете ли проверка 2->10? Y/N: ')
    if ask.upper() == 'Y':
        print(f2(string_remainders[::-1]))
    else:
        print(string_remainders[::-1])


f1(10)
