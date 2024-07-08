from account import Account


class Savings(Account):
    def __init__(self, holderName, balance, interest_rate):
        super().__init__(holderName, balance)
        self.interest_rate = interest_rate

    def calculate_interest_rate(self):
        self.balance *= self.interest_rate
        print(f'New balance: {self.balance}')


account = Account('Leon', 1000)
savings = Savings('Leon', 1000, 1.5)
savings.calculate_interest_rate()
