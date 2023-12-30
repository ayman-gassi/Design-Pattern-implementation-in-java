import java.util.ArrayList;
import java.util.List;

public abstract class Sujet {
    private List<Observateur> observateurs = new ArrayList<>();

    public void ajouterObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void retirerObservateur(Observateur observateur) {
        observateurs.remove(observateur);
    }

    public void notifierObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.actualise();
        }
    }
}
