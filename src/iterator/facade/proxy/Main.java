package iterator.facade.proxy;

public class Main {
    public static void main(String[] args) {
        // App acts as a facade
        // Complex operations are abstracted
        StudentCollection sc = App.generateTestData();
        App.demoSortedIterator(sc, 46);
        App.demoIterator(sc);
    }
}
