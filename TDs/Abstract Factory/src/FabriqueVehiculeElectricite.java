public class FabriqueVehiculeElectricite implements FabriqueVehicule {
    @Override
    public Automobile CreerAutomobile(int model, int puissance, int espace, String color) {
        return new AutomobileElectricite( model,  puissance,  espace,  color) ;
    }
    @Override
    public Scooter CreerScooter(int model, int puissance, int espace, String color) {
        return new ScooterElectricite( model,  puissance,  espace,  color) ;
    }
}
