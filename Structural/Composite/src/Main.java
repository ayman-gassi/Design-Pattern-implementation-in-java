
public class Main {
    public static void main(String[] args) {
        Department student1 = new Student("Ayman GASSI", "Computer Science");
        Department student2 = new Student("Zakaia MACHAMACH", "Computer Science");
        Department professor1 = new Professor("Dr. KARAMI", "Computer Science");
        Department professor2 = new Professor("Dr. ZIAD", "AI");
        University UNIVER = new University("ESTE");
        UNIVER.addMember(student1);
        UNIVER.addMember(student2);
        UNIVER.addMember(professor2);
        UNIVER.addMember(professor1);
        UNIVER.Details();
    }
}