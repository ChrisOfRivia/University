def count_it(string_numbers):
    dict_nums = {}
    for numbers in string_numbers:
        numbers = int(numbers)
        if numbers not in dict_nums.keys():
            dict_nums[numbers] = 0
        dict_nums[numbers] += 1
    biggest_nums = dict(sorted(dict_nums.items(), key=lambda x: -x[1]))
    if len(biggest_nums) > 3:
        return list(biggest_nums.keys())[:3]
    return 'String has less than 3 numbers!'


print(count_it('161201239105611'))
