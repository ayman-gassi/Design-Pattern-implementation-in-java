public class Student implements Department{
    private String name;
    private String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public void Details() {
        System.out.println("Student: " + name + ", Department: " + department);
    }
}