public class Professor implements Department{
    private String name;
    private String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public void Details() {
        System.out.println("Professor: " + name + ", Department: " + department);
    }
}