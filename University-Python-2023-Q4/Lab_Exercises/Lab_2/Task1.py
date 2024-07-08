class Person:
    def __init__(self, name=str, age=int):
        self.name = name
        self.age = age

    def call_person(self):
        return (f'Name: {self.name}\n'
                f'Age: {self.age}')


person_1 = Person('Gosho', 18)
print(person_1.call_person())
