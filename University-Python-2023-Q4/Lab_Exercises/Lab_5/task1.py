import random

n = int(input('N: '))
list_nums = []
done = False

if n in range(16, 35):
    done = True

if done:
    for _ in range(n):
        list_nums.append(random.randint(30, 300))

    print(list_nums)

    num_tens_div_3 = [x for x in list_nums if x // 10 % 10 % 3 == 0]
    if num_tens_div_3:
        print(f'Length of numbers\' tens divizable by 3: {len(num_tens_div_3)}')
    else:
        print(f'No numbers with tens divizable by 3')

    nums_div_6_ost_4 = [x for x in list_nums if x % 6 == 4]
    if nums_div_6_ost_4:
        print(f'Index of lowest number in list of nums % 6 == 4: {list_nums.index(min(nums_div_6_ost_4))}')
    else:
        print(f'No numbers with nums % 6 == 4')

    two_digit_nums = [x for x in list_nums if x in range(10, 100)]
    two_digit_nums_divizable_by_2_or_3 = [x for x in two_digit_nums if x % 2 == 0 or x % 3 == 0]
    if two_digit_nums_divizable_by_2_or_3:
        print(f'Numbers with 2 digits divizable by 2 or 3: {two_digit_nums_divizable_by_2_or_3}')
    else:
        print(f'No 2 digit numbers divizable by 2 or 3')

    odd_indexes = [x for x in two_digit_nums if two_digit_nums.index(x) % 2 != 0]
    even_indexes = [x for x in two_digit_nums if two_digit_nums.index(x) % 2 == 0]

    if odd_indexes:
        print(f'Median of odd indexes is: {sum(odd_indexes) / len(odd_indexes)}')
    else:
        print(f'No odd indexes')

    if even_indexes:
        print(f'Removed number in even indexes: {min(even_indexes)}')
        even_indexes.remove(min(even_indexes))
    else:
        print(f'No even indexes')

