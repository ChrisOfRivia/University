#operacii sus spisuk i handle-va edin attribute error ako atribut ne sushtesvuva

array = []

try:
    # array[0]
    # array.remove()
    array.delete
except IndexError:
    print(f'No element on that index')
except TypeError:
    print('No argument given!')
except AttributeError:
    print(f'No real attribute for list!')
