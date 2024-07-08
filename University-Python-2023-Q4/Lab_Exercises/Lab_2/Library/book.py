class Book:
    def __init__(self, serial, name, author, genre, copies_available, copies_whole):
        self.serial = serial
        self.name = name
        self.author = author
        self.genre = genre
        self.copies_available = copies_available
        self.copies_whole = copies_whole

    def info(self):
        return f'#{self.serial} - "{self.name}" by {self.author} ({self.genre}) [{self.copies_available}/{self.copies_whole}]'

    def checkout(self):
        if self.copies_available > 0:
            print(f'Checking in for {self.__str__()}')
            self.copies_available -= 1
            print(f'{self.info()}')
        else:
            print(f'No copies available')

    def checkin(self):
        if self.copies_whole != self.copies_available:
            print(f'Checking out for {self.__str__()}')
            self.copies_available += 1
        else:
            print(f'Book copies already max')

    def __str__(self):
        return f'[{self.name} - {self.author} - {self.genre} ({self.copies_available}/{self.copies_whole})]'


