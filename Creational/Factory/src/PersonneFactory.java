public class PersonneFactory {
    public Personne createPerson(String type) {
        if (type.equalsIgnoreCase("student")) {
            return new Student();
        } else if (type.equalsIgnoreCase("teacher")) {
            return new Teacher();
        } else {
            throw new IllegalArgumentException("Invalid person type");
        }
    }
}
