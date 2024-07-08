text = input()

dictionary = {}

for each in text:
    if each not in dictionary.keys():
        dictionary[each] = 0
    dictionary[each] += 1

print(dictionary)