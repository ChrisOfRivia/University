class Worker:
    worker_list = []

    def __init__(self, worker_num=str, fname=str, lname=str, work_experience_company=int, salary=float, age=int):
        self.worker_num = worker_num
        self.fname = fname
        self.lname = lname
        self.work_experience_company = work_experience_company
        self.salary = salary
        self.age = age
        self.bonus = None

    def worker_information(self):
        str = f'{self.worker_num}: {self.fname} {self.lname}, {self.age} Y/O\n'
        str += f'Experience: {self.work_experience_company}\n'
        str += f'Salary: {self.salary}$\n'
        return str

    def salary_bonus(self):
        if self.work_experience_company in range(5, 11):
            self.bonus = self.salary * (1.5 / 100)
            self.salary += self.bonus
        elif self.work_experience_company > 10:
            self.bonus = self.salary * (1.5 / 100)
            self.salary += self.bonus
        else:
            self.bonus = self.salary * (0.5 / 100)
            self.salary += self.bonus

        return f'Bonus added to salary: {self.bonus}$'


def search_by_num(workers_list, worker_number=str):
    for worker in workers_list:
        if worker.worker_num == worker_number:
            return True
    return False


def search_by_name_experience(workers_list, fname, lname, experience):
    list_of_search = []
    for worker in workers_list:
        if worker.fname == fname and worker.lname == lname and worker.work_experience_company == experience:
            list_of_search.append(worker.worker_information())

    if list_of_search:
        return list_of_search
    return f'No worker with given data!'


def add_worker(worker_list, worker):
    worker_list.append(worker)


def remove_worker(worker_num):
    for worker in Worker.worker_list:
        if worker.worker_num == worker_num:
            Worker.worker_list.remove(worker)
            return f'Information deleted !!!'
    return f'Wrong worker_num !!!'


# num_workers = int(input('Num workers: '))
# for idx in range(num_workers):
#     print(f'Worker [{idx + 1}]')
#     w_number = str(input('Worker number: '))
#     f_name = str(input('First name: '))
#     l_name = str(input('Last name: '))
#     experience = int(input('Work experience: '))
#     salary = float(input('Salary: '))
#     age = int(input('Age: '))
#
#     Worker.worker_list.append(Worker(w_number, f_name, l_name, experience, salary, age))

worker = Worker('123', 'Ivan', 'Ivanov', 5, 1000, 20)
add_worker(Worker.worker_list, worker)

print(search_by_num(Worker.worker_list, '123'))
print(search_by_name_experience(Worker.worker_list, 'Ivan', 'Ivanov', 5))
print(remove_worker('123'))
print(Worker.worker_list)