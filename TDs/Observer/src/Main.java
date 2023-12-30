public class Main {
    public static void main(String[] args) {
        SujetConcret sujetVehicule = new SujetConcret();
        ObservateurConcret O1 = new ObservateurConcret(sujetVehicule);
        ObservateurConcret O2 = new ObservateurConcret(sujetVehicule);
        sujetVehicule.setEtat("En marche");
        sujetVehicule.setEtat("Arrêté");
    }
}

