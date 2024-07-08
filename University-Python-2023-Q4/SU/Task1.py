def char_histogram(string):
    dict_chars = {}
    for char in string:
        if char not in dict_chars.keys():
            dict_chars[char] = 0
        dict_chars[char] += 1

    return dict_chars


print(char_histogram('Hello !'))
