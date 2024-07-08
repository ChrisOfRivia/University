from student import Student
from person import Person


class Lecturer(Student):
    def __init__(self, name, surname, age, nationality, university, year_of_learning, l_name, l_surname,
                 experience=int):
        super().__init__(name, surname, age, nationality, university, year_of_learning)
        self.l_name = l_name
        self.l_surname = l_surname
        self.experience = experience

    def info_lecturer(self):
        super().student_print()
        print('<-->')
        print(f'Lecturer: {self.l_name} {self.l_surname}\n'
              f'Years: {self.experience}')


person = Person('Gosho', 'Chaushev', 15, 'Bulgarian')
student = Student('Gosho', 'Chaushev', 15, 'Bulgarian', 'TU', 2027)
lecturer = Lecturer('Gosho', 'Chaushev', 15, 'Bulgarian', 'TU', 2027, 'Toma', 'Chonkov', 15)

lecturer.info_lecturer()
