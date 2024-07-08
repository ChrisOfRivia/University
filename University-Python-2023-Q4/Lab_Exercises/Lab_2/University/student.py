# definira class person, ime, familiq, age, nationality, construktor koito inicializira poletata
from Lab_2.University.person import Person


class Student(Person):
    def __init__(self, name, surname, age, nationality, university=str, year_of_learning=int):
        super().__init__(name, surname, age, nationality)
        self.university = university
        self.year_of_learning = year_of_learning

    def student_print(self):
        super().print()
        print('<-->')
        print(f'University: {self.university}\n'
              f'Year: {self.year_of_learning}')


person1 = Person('Emily', 'Barakush', 20, 'Moldova')

