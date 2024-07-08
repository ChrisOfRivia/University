class Cat:
    def __init__(self, name=str, age=int, gender=str):
        self.name = name
        self.age = age
        self.gender = gender

    def meow(self):
        print(f'{self.name} meows...')

    def eat(self):
        print(f'{self.name} is eating...')

    def age_up(self):
        self.age += 1
        print(f'{self.name} has aged up!!')


cat_1 = Cat('Berk', 1, 'M')
cat_1.meow()
cat_1.eat()
cat_1.age_up()
