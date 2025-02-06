package Ex4;

import java.io.*;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Book> books = new LinkedList<>();

        Book book1 = new Book("A", "A1");
        Book book2 = new Book("B", "B1");
        Book book3 = new Book("C", "C1");
        Book book4 = new Book("D", "D1");
        Book book5 = new Book("E", "E1");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Ex4/books.ser"))){
            oos.writeObject(books);
            System.out.println("Object was written!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Ex4/books.ser"))){
            ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println(books.element().author);
        System.out.println(books.element().name);
    }
}
