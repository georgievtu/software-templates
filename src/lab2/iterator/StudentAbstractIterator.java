package lab2.iterator;

import lab2.Student;

import java.util.List;

public abstract class StudentAbstractIterator implements CustomIterator<Student> {
    public StudentAbstractIterator(List<Student> students) {
        // TODO Initialize starting index and students
    }

    protected int index;
    protected List<Student> students;
}
