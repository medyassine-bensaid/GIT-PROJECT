public class  Enseignant implements Comparable< Enseignant>{
    private int id;
    private String nom;
    private String prenom;
        private String cin;


    public  Enseignant() {
    }

    public  Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
                this.cin = cin;

    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
         Enseignant  Enseignant = ( Enseignant) o;
        return id ==  Enseignant.id;
    }

    @Override
    public String toString() {
        return " Enseignant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
    }

    @Override
    public int compareTo( Enseignant o) {
        return this.id-o.id;
    }
}