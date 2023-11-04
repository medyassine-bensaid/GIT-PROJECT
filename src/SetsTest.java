import java.util.HashSet;
import java.util.Set;
 // by med yassine
public class SetsTest {
    public static void main(String[] args) {

        
        // Create some Etudiant objects
        Etudiant etudiant1 = new Etudiant(1, "John", "bob");
        Etudiant etudiant2 = new Etudiant(2, "Alice", "Smith");
        Etudiant etudiant3 = new Etudiant(3, "Bob", "Johnson");
        Etudiant etudiant4 = new Etudiant(4, "Eva", "Brown");
        Etudiant etudiant5 = new Etudiant(5, "Michael", "Williams");

        // Create a HashSet to store Etudiant objects
        Set<Etudiant> etudiantSet = new HashSet<>();

        // Add Etudiant objects to the set
        etudiantSet.add(etudiant1);
        etudiantSet.add(etudiant2);
        etudiantSet.add(etudiant3);
        etudiantSet.add(etudiant4);
        etudiantSet.add(etudiant5);

        // Display the set of Etudiant objects
        System.out.println("Set of Etudiant objects:");
        for (Etudiant etudiant : etudiantSet) {
            System.out.println(etudiant);
        }

        // Check if a specific Etudiant is in the set
        Etudiant etudiantToFind = new Etudiant(3, "Bob", "Johnson");
        boolean containsEtudiant = etudiantSet.contains(etudiantToFind);
        System.out.println("\nDoes the set contain " + etudiantToFind + "? " + containsEtudiant);

        // Remove an Etudiant from the set
        etudiantSet.remove(etudiant2);

        // Display the updated set
        System.out.println("\nUpdated set of Etudiant objects:");
        for (Etudiant etudiant : etudiantSet) {
            System.out.println(etudiant);
        }

        // this it

    }
}
