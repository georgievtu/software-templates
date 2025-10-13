package iterator.facade.proxy;

import java.util.List;

public class StudentSortedProxyIterator extends StudentAbstractIterator {
    public StudentSortedProxyIterator(List<Student> students) {
        super(students);

        // Fill the sorted indices
        sortedIndices = new Integer[students.size()];
        for (int i = 0; i < students.size(); i++) {
            sortedIndices[i] = i;
        }

        // TODO Sort the sorted indices by the order of the collection
        // TODO Do NOT sort the collection itself
        // TODO Use Arrays.sort
    }

    @Override
    public boolean hasNext() {
        // TODO Check if the index exceeds the collection's size
        return false;
    }

    @Override
    public Student next() {
        // TODO If hasNext is false, throw a NoSuchElementException
        // TODO Otherwise, return the next element by the sorted index
        return null;
    }

    private final Integer[] sortedIndices;
}
