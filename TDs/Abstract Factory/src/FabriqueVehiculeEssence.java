public class FabriqueVehiculeEssence implements FabriqueVehicule {
    @Override
    public Automobile CreerAutomobile(int model, int puissance, int espace, String color) {
        return new AutomobileEssence ( model,  puissance,  espace,  color) ;
    }
    @Override
    public Scooter CreerScooter(int model, int puissance, int espace, String color) {
        return new ScooterEssence ( model,  puissance,  espace,  color) ;
    }
}
