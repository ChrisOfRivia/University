import random


def generate_random_number():
    rand_number = ''
    for _ in range(5):
        randint = random.randint(1, 9)
        rand_number += str(randint)

    return rand_number


class Account:
    def __init__(self, holderName=str, balance=0):
        self.number = generate_random_number()
        self.holderName = holderName
        self.balance = balance

    def deposit(self, money):
        self.balance += money
        print(f'Deposited {money}$ successfully!')

    def withdraw(self, money):
        if self.balance <= 0 or money > self.balance:
            print(f'Cannot withdraw')
        else:
            self.balance -= money
            print(f'Withdrawn {money}$ successfully!')

    def check_balance(self):
        print(f'Current balance: {self.balance}')

    def __str__(self):
        return f'Number: {self.number}\n' + f'Account Holder: {self.holderName}\n' + f'Balance: {self.balance}'

