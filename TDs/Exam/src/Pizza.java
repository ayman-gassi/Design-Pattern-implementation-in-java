    public class Personne{
        private int id;
        private String job ;
        private String nom ;
        private String email ;
        private String password ;

        public Personne(int id, String job, String nom, String email, String password) {
            this.id = id;
            this.job = job;
            this.nom = nom;
            this.email = email;
            this.password = password;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
