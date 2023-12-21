
public class Main {
    public static void main(String[] args) {
        Etudiant Etudiant1 = new Etudiant.PersonBuilder("Ayman")
                .setCodeMassar("R141051419")
                .setNiveauEtude("ISIL")
                .build();
        System.out.println("Name: " + Etudiant1.getName());
        System.out.println("Coder Massar: " + Etudiant1.getCodeMassar());
        System.out.println("Niveau d'etude: " + Etudiant1.getNiveauEtude());

        Etudiant Etudiant2 = new Etudiant.PersonBuilder("Zakaria")
                .setNiveauEtude("GI2")
                .build();
        System.out.println("Name: " + Etudiant2.getName());
        System.out.println("Coder Massar: " + Etudiant2.getCodeMassar());
        System.out.println("Niveau d'etude: " + Etudiant2.getNiveauEtude());
    }
}