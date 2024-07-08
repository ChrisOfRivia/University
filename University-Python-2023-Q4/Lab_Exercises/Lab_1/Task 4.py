num = input()

nums = [int(x) for x in range(1, int(num) + 1)]
nums_reversed = [int(x) for x in range(int(num), 0, -1)]

dictionary = {}

for key, value in zip(nums, nums_reversed):
    dictionary[key] = value

print(dictionary)