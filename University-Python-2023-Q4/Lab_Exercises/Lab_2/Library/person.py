class Person:
    def __init__(self, name, age, address):
        self.name = name
        self.age = age
        self.address = address

    def __str__(self):
        return f'[{self.name} - {self.age} - {self.address}]'

    def info(self):
        return f'{self.name} - {self.age} - {self.address}'
