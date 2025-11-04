package lab2.iterator;

import lab2.Student;

import java.util.List;

public class StudentIterator extends StudentAbstractIterator {
    public StudentIterator(List<Student> students) {
        super(students);
    }

    @Override
    public boolean hasNext() {
        // TODO Check if the index exceeds the collection's size
        return false;
    }

    @Override
    public Student next() {
        // TODO If hasNext is false, throw a NoSuchElementException
        // TODO Otherwise, return the next element by index
        return null;
    }
}
