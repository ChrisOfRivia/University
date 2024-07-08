def set_gen(list_nums):
    dict_nums = {}
    for idx, numbers in enumerate(list_nums):
        if numbers not in dict_nums.keys():
            dict_nums[numbers] = 0
        dict_nums[numbers] += 1
        if dict_nums[numbers] > 1:
            list_nums[idx] = str(numbers) * dict_nums[numbers]

    return list_nums


print(set_gen([1, 2, 3, 4, 4, 4, 5, 6, 2]))
