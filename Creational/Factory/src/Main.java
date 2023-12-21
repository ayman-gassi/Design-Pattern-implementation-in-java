// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PersonneFactory Factory = new PersonneFactory();
        Personne S = Factory.createPerson("student");
        S.Speak();
        Personne T = Factory.createPerson("teacher");
        T.Speak();
    }
}