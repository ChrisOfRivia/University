class Grades:
    grades = []

    @staticmethod
    def add_grades(list_grades):
        Grades.grades = list_grades

    def calc_median(self):
        if not Grades.grades:
            return f'No grades!'
        return sum(Grades.grades) / len(Grades.grades)

    @staticmethod
    def calc_grade(grade):
        if grade in range(90, 101):
            return 'A'
        elif grade in range(80, 90):
            return 'B'
        elif grade in range(70, 80):
            return 'C'
        elif grade in range(60, 70):
            return 'D'
        else:
            return 'F'

