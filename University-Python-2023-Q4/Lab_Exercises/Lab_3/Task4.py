# клас, който се казва InvalidInputError има функция приемаща вход и raise-ва custom Exception ако input ne e pozitiven integer

class InvalidInputError:
    def getNumber(self, number):
        if type(number) != int and type(number) != float:
            raise ValueError('Input must be a number!')
        elif number < 0:
            raise Exception('Number must be positive!')
        else:
            return number


a = InvalidInputError()
a.getNumber(-3)
print(a.getNumber(3))
