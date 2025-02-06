package Example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("X"));
        studentList.add(new Student("C"));
        studentList.add(new Student("A"));
        studentList.add(new Student("B"));

        List<Student> result = studentList.stream()
                .filter((student) -> !student.getName().equals("X"))
                .sorted((student1, student2) -> student1.getName().compareTo(student2.getName()))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
