def sum_of_num_string(num_string):
    return sum([int(x) for x in num_string if x.isnumeric()])


def sum_of_even_nums_in_num_string(num_string):
    return sum([int(x) for x in num_string if int(x) % 2 == 0])


string_nums = input('Въведете числа: ')
print(sum_of_num_string(string_nums))
print(sum_of_even_nums_in_num_string(string_nums))
