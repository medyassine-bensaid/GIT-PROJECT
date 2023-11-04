public class Cours {
    private String nom;
    private int code;

    public Cours(String nom, int code) {
        this.nom = nom;
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Cours [nom=" + nom + ", code=" + code + "]";
    }
}
