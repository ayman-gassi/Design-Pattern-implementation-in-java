

public class Main {
    public static void main(String[] args) {
        FabriqueVehiculeElectricite FE1 = new FabriqueVehiculeElectricite();
        FE1.CreerAutomobile(1 , 10 , 20 , "Jaune").AfficheCarac(1 , 10 , 20 , "Jaune");
        FE1.CreerScooter(2 , 20 , 30 , "Red").AfficheCarac(2 , 20 , 30 , "Red");
    }
}
