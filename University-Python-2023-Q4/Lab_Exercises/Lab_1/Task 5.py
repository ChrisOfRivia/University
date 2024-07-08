random_stuff = tuple(set(x for x in input().split()))
tuple = tuple(x for x in random_stuff if x.isalpha())
print(tuple)