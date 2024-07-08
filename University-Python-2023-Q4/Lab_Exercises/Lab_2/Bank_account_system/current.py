# overdraft limit i metod da go proverqva
from account import Account


class Current(Account):
    def __init__(self, holderName, balance, overdraft):
        super().__init__(holderName, balance)
        self.overdraft = overdraft

    def overdrafting(self):
        if self.balance == 0:
            ask = input(f'Balance is 0, would you like to overdraft? Y/N: ')
            if ask.upper() == 'Y':
                self.balance += self.overdraft
                print(f'OVERDRAFT! Bank loans {self.overdraft}$ to {self.holderName}')
            elif ask.upper() == 'N':
                print('Canceling...')


account = Current('Leon', 1000, 100)

account.check_balance()
account.withdraw(1000)
account.overdrafting()
account.check_balance()
print(str(account))