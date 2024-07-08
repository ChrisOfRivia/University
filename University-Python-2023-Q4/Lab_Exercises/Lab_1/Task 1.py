# from collections import deque
#
# num = input()
#
# nums = []
# nums_reversed = deque()
#
# for x in num:
#     nums.append(int(x))
#     nums_reversed.appendleft(int(x))
#
# cortage1 = tuple(nums)
# cortage2 = tuple(nums_reversed)
#
# print(cortage1)
# print(cortage2)

nums = input()

cortage1 = tuple(int(x) for x in nums)
cortage2 = tuple(int(x) for x in nums[::-1])

print(cortage1)
print(cortage2)
