import java.util.List;

public class Main {


    public void conflit(List<Etudiant> etudiants) {
                if (etudiants.size() >= 2) {
                    Etudiant etudiant1 = etudiants.get(0);
                    Etudiant etudiant2 = etudiants.get(1);
                    Etudiant etudiant3 = etudiants.get(2);
            
                    int sumOfIds = etudiant1.getId() + etudiant2.getId();
                    System.out.println("Sum of IDs of the first two students: " + sumOfIds);
                } else {
                    System.out.println("Not enough students to calculate the sum.");
                }
        }
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant(1, "Samir", "Ghrab");

        Etudiant etudiant2 = new Etudiant(2, "Bob", "Marley");
        Etudiant etudiant3 = new Etudiant(3, "Sqqd", "Bgir");

        GestionEtudiant gestionEtudiant = new GestionEtudiant();

        gestionEtudiant.ajouterEtudiant(etudiant1);
        gestionEtudiant.ajouterEtudiant(etudiant2);
        gestionEtudiant.ajouterEtudiant(etudiant3);

       
            
        

        System.out.println("Liste des étudiants :");
        gestionEtudiant.displayEtudiants();

        // Create some Cours instances
        Cours cours1 = new Cours("Java Programming", 101);
        Cours cours2 = new Cours("Data Structures", 201);

        System.out.println("Liste des cours :");
        System.out.println(cours1);
        System.out.println(cours2);

        System.out.println("Étudiant par nom : " + gestionEtudiant.rechercherEtudiant("Samir"));
        System.out.println("Étudiant par id : " + gestionEtudiant.rechercherEtudiant(etudiant2));

        // Tri par id
        System.out.println("Tri par id");
        gestionEtudiant.trierEtudiantsParId();
        gestionEtudiant.displayEtudiants();

        // Tri des étudiants par nom
        System.out.println("Tri par nom");
        gestionEtudiant.trierEtudiantsParNom();
        gestionEtudiant.displayEtudiants();

        System.out.println("Supprimer");
        gestionEtudiant.supprimerEtudiant(etudiant2);
        gestionEtudiant.displayEtudiants();
    }
}
