a = [x for x in map(int, input('Enter multiple numbers: ').split())]

empty_list = False
try:
    median = sum(a) / len(a)
    print(f'The median is: {median}')
except ZeroDivisionError:
    print(f'The list cannot be empty!\n')
    empty_list = True

counter = 0
while counter < 5 and not empty_list:
    try:
        num = int(input('Enter a number: '))
        a.append(num)
        counter += 1
    except ValueError:
        print(f'Variable only accepts numbers!\n')
        continue
    finally:
        print(f'?')

print(a) if a else None
