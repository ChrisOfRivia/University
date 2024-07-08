string = input()

def palindrome(x):
    if x == x[::-1]:
        return 1
    else:
        return 0

print(palindrome(string))

