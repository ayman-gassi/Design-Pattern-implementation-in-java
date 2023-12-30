import java.util.List;

public class Main {
    public static void main(String[] args) {
        CompteBancaire C1 = new CompteBancaire(555);
        C1.deposerArgent(100);
        C1.retirerArgent(20);

        CompteBancaire C2 = new CompteBancaire(11);
        C2.deposerArgent(500);
        C2.retirerArgent(200);

        List<String> logs = Journalisation.getInstance().getLogs();
        System.out.println("\nJournal des opérations :");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}