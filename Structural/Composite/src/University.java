import java.util.ArrayList;
import java.util.List;

public class University implements Department {
    private String name;
    private List<Department> members = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addMember(Department member) {
        members.add(member);
    }

    @Override
    public void Details() {
        System.out.println("Department: " + name);
        for (Department member : members) {
            member.Details();
        }
    }
}