package iterator.facade.proxy;

public class Student {
    public Student(String name, String facultyNumber, int group) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    private String name;
    private String facultyNumber;
    private int group;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", facultyNumber='" + facultyNumber + '\'' +
                ", group=" + group +
                '}';
    }
}
