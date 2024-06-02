package models;

public class LaClasse {
    private int id_classe;
    private int id_enseignant_principal;
    private String nom_classe;
    private String niveau;

    public LaClasse(int id_classe, int id_enseignant_principal, String nom_classe, String niveau) {
        this.id_classe = id_classe;
        this.id_enseignant_principal = id_enseignant_principal;
        this.nom_classe = nom_classe;
        this.niveau = niveau;
    }

    public LaClasse(int id_enseignant_principal, String nom_classe, String niveau) {
        this.id_enseignant_principal = id_enseignant_principal;
        this.nom_classe = nom_classe;
        this.niveau = niveau;
    }

    public int getId_classe() {
        return id_classe;
    }

    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

    public int getId_enseignant_principal() {
        return id_enseignant_principal;
    }

    public void setId_enseignant_principal(int id_enseignant_principal) {
        this.id_enseignant_principal = id_enseignant_principal;
    }

    public String getNom_classe() {
        return nom_classe;
    }

    public void setNom_classe(String nom_classe) {
        this.nom_classe = nom_classe;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}
