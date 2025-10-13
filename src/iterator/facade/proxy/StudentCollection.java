package iterator.facade.proxy;

import java.util.List;

public class StudentCollection {
    public StudentCollection(List<Student> students) {
        // TODO Initialize students
    }

    public CustomIterator<Student> createIterator() {
        // TODO Create and return a normal iterator
        return null;
    }

    public CustomIterator<Student> createSortedIterator() {
        // TODO Create and return a sorted iterator
        return null;
    }

    // Private. Do not expose the collection, only the iterator
    private List<Student> students;
}
