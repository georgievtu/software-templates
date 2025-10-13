package iterator.facade.proxy;

import java.util.ArrayList;
import java.util.List;

public class App {
    static StudentCollection generateTestData() {
        Student s1 = new Student("Georgi", "222", 45);
        Student s2 = new Student("Ivan", "333", 45);
        Student s3 = new Student("Angel", "111", 45);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        return new StudentCollection(students);
    }

    static void demoSortedIterator(StudentCollection sc, int newGroup) {
        CustomIterator<Student> sortedIterator = sc.createSortedIterator();

        // TODO Change the group of the first student (alphabetically) to newGroup
        // TODO Use sortedIterator
    }

    static void demoIterator(StudentCollection sc) {
        CustomIterator<Student> iterator = sc.createIterator();

        // TODO Print the students in the order of insertion
        // TODO Use a loop with iterator
    }
}
