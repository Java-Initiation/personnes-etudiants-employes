import models.Employe;
import models.Etudiant;
import models.Personne;
import models.Professeur;

public class Main {

    public static void main(String[] args) {

        Etudiant etudiant1 = new Etudiant(1, "A", "a", "1");
        Etudiant etudiant2 = new Etudiant(2, "B", "b", "2");

        Professeur professeur1 = new Professeur(3, "C", "c", 2000, "maths");
        Professeur professeur2 = new Professeur(4, "D", "d", 1500, "français");

        Employe employe1 = new Employe(5, "E", "e", 1700);
        Employe employe2 = new Employe(6, "F", "f", 1600);

        afficherPersonnes(etudiant1, etudiant2, professeur1, professeur2, employe1, employe2);

    }

    // var-args : arguments variables en utilisant "..."
    public static void afficherPersonnes(Personne... personnes){
        for (Personne personne: personnes){
            System.out.println(personne.toString());
        }
    }

}
