package models;

public class Professeur extends Employe {

    private String specialite;

    public Professeur(int id, String nom, String prenom, double salaire, String specialite) {
        super(id, nom, prenom, salaire);
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "specialite='" + specialite + '\'' +
                ", salaire=" + salaire +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

}
