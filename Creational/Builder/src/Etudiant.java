public class Etudiant {
    private String name;
    private String CodeMassar;
    private String NiveauEtude;

    private Etudiant(PersonBuilder builder) {
        this.name = builder.name;
        this.CodeMassar = builder.CodeMassar;
        this.NiveauEtude = builder.NiveauEtude;
    }
    public String getName() {
        return name;
    }

    public String getCodeMassar() {
        return CodeMassar;
    }

    public String getNiveauEtude() {
        return NiveauEtude;
    }

    public static class PersonBuilder {
        private String name;
        private String CodeMassar;
        private String NiveauEtude;

        public PersonBuilder(String name) {
            this.name = name;
        }

        public PersonBuilder setNiveauEtude(String NiveauEtude) {
            this.NiveauEtude = NiveauEtude;
            return this;
        }
        public PersonBuilder setCodeMassar(String CodeMassar) {
            this.CodeMassar = CodeMassar;
            return this;
        }
        

        public Etudiant build() {
            return new Etudiant(this);
        }
    }


}