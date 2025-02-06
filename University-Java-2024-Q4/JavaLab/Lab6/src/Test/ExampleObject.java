package Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExampleObject {
    public static void main(String[] args) {
        MyClass a = new MyClass(10);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.bin"))){
            oos.writeObject(a);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
