from Lab_4.grades.grades import Grades


def turn_points_to_letters(list_points):
    new_list = []
    for grade in list_points:
        if Grades.calc_grade(grade) == 'A':
            new_list.append(f'A')
        elif Grades.calc_grade(grade) == 'B':
            new_list.append(f'B')
        elif Grades.calc_grade(grade) == 'C':
            new_list.append(f'C')
        elif Grades.calc_grade(grade) == 'D':
            new_list.append(f'D')
        elif Grades.calc_grade(grade) == 'F':
            new_list.append(f'F')

    return new_list
