from book import Book
from person import Person


class Library:
    def __init__(self):
        self.books = []
        self.people = []

    def add_book(self, book=Book):
        self.books.append(str(book))

    def remove_book(self, book=Book):
        self.books.remove(str(book))

    def register(self, person=Person):
        self.people.append(str(person))

    def display(self):
        print(f'Books: ')
        if self.books:
            for book in self.books:
                print(f'{book}')
        print(f'People: ')
        if self.people:
            for person in self.people:
                print(f'{person}')


person1 = Person('John', 15, 'Address1')
person2 = Person('Jane', 13, 'Address2')

book = Book('00001', 'UP', 'John Doe', 'Novel', 5, 6)

library = Library()
library.add_book(book)
library.register(person1)
library.register(person2)

library.display()
