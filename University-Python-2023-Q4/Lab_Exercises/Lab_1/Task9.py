def turn_zeros(list_nums, num):
    for each_num in list_nums:
        if each_num > num:
            list_nums[each_num - 1] = 0

    return list_nums


nums = list(set(map(int, input('Numbers: ').split())))
strong_number = int(input('Strong number: '))

print(turn_zeros(nums, strong_number))
