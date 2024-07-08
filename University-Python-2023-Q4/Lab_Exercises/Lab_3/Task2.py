# цяло положително число и отпечата корен квадратен. Ако е невалидно invalid number, else goodbye
import math

try:
    num = int(input("Enter a positive number: "))
    num = math.sqrt(num)
    print(f'Square root of {num**2} = {num}')
except ValueError:
    print(f'Invalid number')
except:
    print(f'Goodbye')
