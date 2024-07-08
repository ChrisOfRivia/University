def define_anagrams(str1, str2):
    list_1 = [x.lower() for x in str1]
    list_2 = [x.lower() for x in str2]

    if sorted(list_1) == sorted(list_2):
        return True
    return False


print(define_anagrams('Мария', 'армия'))
