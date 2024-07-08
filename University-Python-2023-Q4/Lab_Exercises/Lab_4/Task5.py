from Lab_4.grades.grades import Grades
from Lab_4.grades.turn_points_into_letters import turn_points_to_letters

ivan = Grades()
ivan.add_grades([90, 20, 40, 50, 60])
print(ivan.calc_median())
print(ivan.calc_grade(ivan.calc_median()))
print(turn_points_to_letters([90, 20, 40, 50, 60]))