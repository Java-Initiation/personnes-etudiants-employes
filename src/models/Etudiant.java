package models;

public class Etudiant extends Personne {

    private String niveau;

    public Etudiant(int id, String nom, String prenom, String niveau) {
        super(id, nom, prenom);
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "niveau='" + niveau + '\'' +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
