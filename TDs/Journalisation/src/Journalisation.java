import java.util.ArrayList;
import java.util.List;

class Journalisation {
    private static Journalisation instance;
    private List<String> logs;

    private Journalisation() {
        logs = new ArrayList<>();
    }

    public static Journalisation getInstance() {
        if (instance == null) {
            instance = new Journalisation();
        }
        return instance;
    }

    public void ajouterLog(String message) {
        logs.add(message);
    }

    public List<String> getLogs() {
        return logs;
    }
}

