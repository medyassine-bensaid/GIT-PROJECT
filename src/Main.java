// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Those are Mohamed Byoudhi changes 

import java.util.List;

public class Main {

          public static void conflit(List<Etudiant> etudiants) {
                // On prend les deux premiers étudiants
                for (int i = 0; i < 2; i++) {
                    Etudiant etudiant = etudiants.get(i);
                    System.out.println("* " + etudiant.getNom());
                }
            }
    public static void main(String[] args) {

        Etudiant etudiant1 = new Etudiant(1, "samir", "ghrab");
        Etudiant etudiant2 = new Etudiant(2, "Bob", "marley");
        Etudiant etudiant3 = new Etudiant(3, "sqqd", "bgir");

        GestionEtudiant gestionEtudiant = new GestionEtudiant();

        
     gestionEtudiant.ajouterEtudiant(etudiant2);
        gestionEtudiant.ajouterEtudiant(etudiant3);
        gestionEtudiant.ajouterEtudiant(etudiant1);
   conflit(null);
        System.out.println("Liste des étudiants :");
        gestionEtudiant.displayEtudiants();

        System.out.println(" étudiant par nom : " + gestionEtudiant.rechercherEtudiant("samir"));
        System.out.println(" étudiant par id : " + gestionEtudiant.rechercherEtudiant(etudiant2));

        // tri par id
        System.out.println("tri par id");
        gestionEtudiant.trierEtudiantsParId();

        gestionEtudiant.displayEtudiants();
// tri par nom
        System.out.println("tri par nom");
        gestionEtudiant.trierEtudiantsParNom();

      
        gestionEtudiant.displayEtudiants();
        System.out.println("supprimer");
        gestionEtudiant.supprimerEtudiant(etudiant2);

        gestionEtudiant.displayEtudiants();
}
}
