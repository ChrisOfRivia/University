class Person:
    def __init__(self, name=str, surname=str, age=int, nationality=str):
        self.name = name
        self.surname = surname
        self.age = age
        self.nationality = nationality

    def print(self):
        print(f'Name: {self.name} {self.surname}\n'
              f'Age: {self.age}\n'
              f'Nationality: {self.nationality}')

